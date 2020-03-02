/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Abdelmalek
 */
public class AppClientController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button BtnSend;
    @FXML
    private TextField msg;
    @FXML
            private TextArea zone;
    Client client;
    BufferedReader in ;
        String message;
        PrintWriter out;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        client=new Client("127.0.0.1", 2000);
        // TODO
        BtnSend.setOnAction((event) -> {
            try {
                
                  String text = msg.getText();
      out.println(text);
      msg.setText(new String(""));
      out.println(text);
   }catch(Exception e)
   {e.printStackTrace();}
//Receive text from server
   try{
     String line = in.readLine();
     System.out.println("Text received: " + line);
   } catch (IOException e){
     System.out.println("Read failed");
     System.exit(1);
   }
                
                
               // client.message=client.in.readLine();
           
                
    });    
    
}
}
