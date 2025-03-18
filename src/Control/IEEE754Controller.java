/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Sample Skeleton for 'IEEE754Interface.fxml' Controller Class
 */
package Control;

import Model.IEEE754;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class IEEE754Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnClean32bitsToDecimal"
    private Button btnClean32bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="btnClean64bitsToDecimal"
    private Button btnClean64bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="btnCleanDecimalTo32bits"
    private Button btnCleanDecimalTo32bits; // Value injected by FXMLLoader

    @FXML // fx:id="btnCleanDecimalTo64bits"
    private Button btnCleanDecimalTo64bits; // Value injected by FXMLLoader

    @FXML // fx:id="btnConverter32bitsToDecimal"
    private Button btnConverter32bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="btnConverter64bitsToDecimal"
    private Button btnConverter64bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="btnConverterDecimalTo32bits"
    private Button btnConverterDecimalTo32bits; // Value injected by FXMLLoader

    @FXML // fx:id="btnConverterDecimalTo64bits"
    private Button btnConverterDecimalTo64bits; // Value injected by FXMLLoader

    @FXML // fx:id="txt32bitsToDecimal"
    private TextField txt32bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txt64bitsToDecimal"
    private TextField txt64bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtDecimalTo32bits"
    private TextField txtDecimalTo32bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtDecimalTo64bits"
    private TextField txtDecimalTo64bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtExpo32bitsToDecimal"
    private TextField txtExpo32bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtExpo64bitsToDecimal"
    private TextField txtExpo64bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtExpoDecimalTo32bits"
    private TextField txtExpoDecimalTo32bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtExpoDecimalTo64bits"
    private TextField txtExpoDecimalTo64bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtIEEE32bitsToDecimal"
    private TextField txtIEEE32bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtIEEE64bitsToDecimal"
    private TextField txtIEEE64bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtIEEEDecimalTo32bits"
    private TextField txtIEEEDecimalTo32bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtIEEEDecimalTo64bits"
    private TextField txtIEEEDecimalTo64bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtMantisa32bitsToDecimal"
    private TextField txtMantisa32bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtMantisa64bitsToDecimal"
    private TextField txtMantisa64bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtMantisaDecimalTo32bits"
    private TextField txtMantisaDecimalTo32bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtMantisaDecimalTo64bits"
    private TextField txtMantisaDecimalTo64bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtSign32bitsToDecimal"
    private TextField txtSign32bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtSign64bitsToDecimal"
    private TextField txtSign64bitsToDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtSignDecimalTo32bits"
    private TextField txtSignDecimalTo32bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtSignDecimalTo64bits"
    private TextField txtSignDecimalTo64bits; // Value injected by FXMLLoader

    IEEE754 ieee754;

    @FXML
    void btnConverterDecimalTo64bits(ActionEvent event) {
        if (!ieee754.isDecimal(txtDecimalTo64bits.getText())) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Se permite solo numeros (Cuidado con los espacios)", ButtonType.CLOSE);
            alert.showAndWait();
            return;
        }
        if (!txtDecimalTo64bits.getText().equals("")) {
            double amount = Double.parseDouble(txtDecimalTo64bits.getText());
            ieee754.decimalToIEEE64bits(amount);
            txtIEEEDecimalTo64bits.setText(ieee754.getIeee64bits());
            txtSignDecimalTo64bits.setText(ieee754.getSign64bits());
            txtExpoDecimalTo64bits.setText(ieee754.getExpo64bits());
            txtMantisaDecimalTo64bits.setText(ieee754.getMantisa64bits());
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "No ha ingresado el valor a convertir", ButtonType.CLOSE);
            alert.showAndWait();
        }
    }

    @FXML
    void clean32bitsToDecimal(ActionEvent event) {
        txtSign32bitsToDecimal.clear();
        txtExpo32bitsToDecimal.clear();
        txtMantisa32bitsToDecimal.clear();
        txt32bitsToDecimal.clear();
        txtIEEE32bitsToDecimal.clear();
    }

    @FXML
    void clean64bitsToDecimal(ActionEvent event) {
        txtSign64bitsToDecimal.clear();
        txtExpo64bitsToDecimal.clear();
        txtMantisa64bitsToDecimal.clear();
        txt64bitsToDecimal.clear();
        txtIEEE64bitsToDecimal.clear();
    }

    @FXML
    void cleanDecimalTo32bits(ActionEvent event) {
        txtIEEEDecimalTo32bits.clear();
        txtSignDecimalTo32bits.clear();
        txtExpoDecimalTo32bits.clear();
        txtMantisaDecimalTo32bits.clear();
        txtDecimalTo32bits.clear();
    }

    @FXML
    void cleanDecimalTo64bits(ActionEvent event) {
        txtIEEEDecimalTo64bits.clear();
        txtSignDecimalTo64bits.clear();
        txtExpoDecimalTo64bits.clear();
        txtMantisaDecimalTo64bits.clear();
        txtDecimalTo64bits.clear();
    }

    @FXML
    void converter32bitsToDecimal(ActionEvent event) {
        if (txtIEEE32bitsToDecimal.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "No ha ingresado el valor a convertir", ButtonType.CLOSE);
            alert.showAndWait();
            return;
        }
        if (!ieee754.isDecimal(txtIEEE32bitsToDecimal.getText())) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "No se permiten letras o espacios en blanco.", ButtonType.CLOSE);
            alert.showAndWait();
            return;
        }
        if (txtIEEE32bitsToDecimal.getText().length() == 32) {
            String ieee = txtIEEE32bitsToDecimal.getText();
            ieee754.iEEE32bitsToDecimal(ieee);
            txtSign32bitsToDecimal.setText(ieee754.getSign32bits());
            txtExpo32bitsToDecimal.setText(ieee754.getExpo32bits());
            txtMantisa32bitsToDecimal.setText(ieee754.getMantisa32bits());
            txt32bitsToDecimal.setText(ieee754.getDecimal32bits() + "");

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "El binario tiene menos de 32 bits", ButtonType.CLOSE);
            alert.showAndWait();
        }
    }

    @FXML
    void converter64bitsToDecimal(ActionEvent event) {
        if (txtIEEE64bitsToDecimal.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "No ha ingresado el valor a convertir", ButtonType.CLOSE);
            alert.showAndWait();
            return;
        }
        if (!ieee754.isDecimal(txtIEEE64bitsToDecimal.getText())) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "No se permiten letras o espacios en blanco.", ButtonType.CLOSE);
            alert.showAndWait();
            return;
        }

        if (txtIEEE64bitsToDecimal.getText().length() == 64) {
            String ieee = txtIEEE64bitsToDecimal.getText();
            ieee754.iEEE64bitsToDecimal(ieee);
            txtSign64bitsToDecimal.setText(ieee754.getSign64bits());
            txtExpo64bitsToDecimal.setText(ieee754.getExpo64bits());
            txtMantisa64bitsToDecimal.setText(ieee754.getMantisa64bits());
            txt64bitsToDecimal.setText(ieee754.getDecimal64bits() + "");

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "El binario tiene menos de 64 bits", ButtonType.CLOSE);
            alert.showAndWait();
        }
    }

    @FXML
    void converterDecimalTo32bits(ActionEvent event) {
        if (!ieee754.isDecimal(txtDecimalTo32bits.getText())) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Se permite solo numeros (Cuidado con los espacios)", ButtonType.CLOSE);
            alert.showAndWait();
            return;
        }
        if (!txtDecimalTo32bits.getText().equals("")) {
            double amount = Double.parseDouble(txtDecimalTo32bits.getText());
            ieee754.decimalToIEEE32bits(amount);
            txtIEEEDecimalTo32bits.setText(ieee754.getIeee32bits());
            txtSignDecimalTo32bits.setText(ieee754.getSign32bits());
            txtExpoDecimalTo32bits.setText(ieee754.getExpo32bits());
            txtMantisaDecimalTo32bits.setText(ieee754.getMantisa32bits());
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "No ha ingresado el valor a convertir", ButtonType.CLOSE);
            alert.showAndWait();
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnClean32bitsToDecimal != null : "fx:id=\"btnClean32bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert btnClean64bitsToDecimal != null : "fx:id=\"btnClean64bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert btnCleanDecimalTo32bits != null : "fx:id=\"btnCleanDecimalTo32bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert btnCleanDecimalTo64bits != null : "fx:id=\"btnCleanDecimalTo64bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert btnConverter32bitsToDecimal != null : "fx:id=\"btnConverter32bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert btnConverter64bitsToDecimal != null : "fx:id=\"btnConverter64bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert btnConverterDecimalTo32bits != null : "fx:id=\"btnConverterDecimalTo32bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert btnConverterDecimalTo64bits != null : "fx:id=\"btnConverterDecimalTo64bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txt32bitsToDecimal != null : "fx:id=\"txt32bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txt64bitsToDecimal != null : "fx:id=\"txt64bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtDecimalTo32bits != null : "fx:id=\"txtDecimalTo32bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtDecimalTo64bits != null : "fx:id=\"txtDecimalTo64bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtExpo32bitsToDecimal != null : "fx:id=\"txtExpo32bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtExpo64bitsToDecimal != null : "fx:id=\"txtExpo64bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtExpoDecimalTo32bits != null : "fx:id=\"txtExpoDecimalTo32bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtExpoDecimalTo64bits != null : "fx:id=\"txtExpoDecimalTo64bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtIEEE32bitsToDecimal != null : "fx:id=\"txtIEEE32bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtIEEE64bitsToDecimal != null : "fx:id=\"txtIEEE64bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtIEEEDecimalTo32bits != null : "fx:id=\"txtIEEEDecimalTo32bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtIEEEDecimalTo64bits != null : "fx:id=\"txtIEEEDecimalTo64bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtMantisa32bitsToDecimal != null : "fx:id=\"txtMantisa32bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtMantisa64bitsToDecimal != null : "fx:id=\"txtMantisa64bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtMantisaDecimalTo32bits != null : "fx:id=\"txtMantisaDecimalTo32bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtMantisaDecimalTo64bits != null : "fx:id=\"txtMantisaDecimalTo64bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtSign32bitsToDecimal != null : "fx:id=\"txtSign32bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtSign64bitsToDecimal != null : "fx:id=\"txtSign64bitsToDecimal\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtSignDecimalTo32bits != null : "fx:id=\"txtSignDecimalTo32bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";
        assert txtSignDecimalTo64bits != null : "fx:id=\"txtSignDecimalTo64bits\" was not injected: check your FXML file 'IEEE754Interface.fxml'.";

        ieee754 = new IEEE754();

        // Restringir a 32 caracteres en txtIEEE32bitsToDecimal
        txtIEEE32bitsToDecimal.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > 32) {
                txtIEEE32bitsToDecimal.setText(oldValue);
            }
        });

        // Restringir a 64 caracteres en txtIEEE64bitsToDecimal
        txtIEEE64bitsToDecimal.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > 64) {
                txtIEEE64bitsToDecimal.setText(oldValue);
            }
        });
    }

}
