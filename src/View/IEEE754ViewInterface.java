/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Nicole Hernandez
 */
public class IEEE754ViewInterface extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(IEEE754ViewInterface.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("IEEE754Interface.fxml"));

        stage.setScene(new Scene(loader.load()));
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.show();
    }
    
}
