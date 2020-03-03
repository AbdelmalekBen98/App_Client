/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appclient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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
    TextField msg;
    @FXML
    TextArea zone;
   
    Socket socket;
     InputStreamReader in;
    PrintWriter out;
    BufferedReader  bf,str;
	/*DataInputStream in ;
       
        DataOutputStream out;*/
    
        
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try {
			socket =new Socket("127.0.0.1",2200);
			 
               
                in = new InputStreamReader(socket.getInputStream());
                bf=new BufferedReader(in);
                out = new PrintWriter(socket.getOutputStream(),true);
                System.out.println("Client Connected");
               
               
                str=new BufferedReader(new InputStreamReader(System.in));
                
              
                     String userInput;
                      while ((userInput = str.readLine()) != null) {
                          out.println(userInput);
                          System.out.println("echo: " + bf.readLine());
                      }
                                                  
    
                        
        // TODO
        BtnSend.setOnAction((event) -> {
            try {
                String Msg="";
                Msg=msg.getText();
                out.println(Msg);
                 
   }catch(Exception e)
   {e.printStackTrace();}
//Receive text from server
  
                
               // client.message=client.in.readLine();
           
                
    });    
    
}       catch (IOException ex) {
            Logger.getLogger(AppClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
}}
