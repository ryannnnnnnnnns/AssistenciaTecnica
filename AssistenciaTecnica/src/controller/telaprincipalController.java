package controller;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class telaprincipalController {

    @FXML
    private Button btnDIspositivo;

    @FXML
    private Button btncliente;

    @FXML
    void telacliente(ActionEvent event) {
        URL url = getClass().getResource("/view/cadastroCliente.fxml");
        try{
        Parent root = FXMLLoader.load(url);
        btncliente.getScene().setRoot(root);
      
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void teladispositivo(ActionEvent event) {

    }

}
