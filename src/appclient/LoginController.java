/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appclient;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdou
 */
public class LoginController implements Initializable {

    @FXML
    Button BtnLogin;
    /**
     * Initializes the controller class.
     */
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void changeScene(ActionEvent event) throws IOException
    {
        Parent client=FXMLLoader.load(getClass().getResource("AppClient.fxml"));
        Scene ClientScene= new Scene(client);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ClientScene);
        window.show();
        
        }
    
}
