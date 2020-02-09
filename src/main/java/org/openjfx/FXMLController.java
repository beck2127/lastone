package org.openjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLController {

    @FXML
    private Button Arbeidsgiver;

    @FXML
    private Button LedigVikariater;

    @FXML
    private Button AdminVikariater;

    @FXML
    private Button Arbeidsforhold;

    @FXML
    private Button OppdatVikariater;

    @FXML
    private Button OppdatArbeidsgiver;

    @FXML
    private Button OppdatArbeidsforhold;

    @FXML
    private Button Søk;

    @FXML
    private Button Digi;



    @FXML
    private void digiButtonAction(ActionEvent event) throws IOException {

            Parent tableViewParent;
            tableViewParent = FXMLLoader.load(getClass().getResource("/org/openjfx/Digi-registerForNyeJobbsøkere.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);

            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

            window.setScene(tableViewScene);
            window.show();




        }
    @FXML
    private void arbeidsgiverButtonAction(ActionEvent event) {

    }
    @FXML
    private void ledigVikariaterButtonAction(ActionEvent event) {

    }


     @FXML
     private void adminVikariaterButtonAction(ActionEvent event) {
     }
    @FXML
    private void arbeidsforholdButtonAction(ActionEvent event) {

    }

    @FXML
     private void oppdatVikariaterButtonAction(ActionEvent event) {

     }
     @FXML
     private void oppdatArbeidsgiverButtonAction(ActionEvent event) {
     }
     @FXML
     private void oppdatArbeidsforholdButtonAction(ActionEvent event) {

     }
    @FXML
    private void søkButtonAction(ActionEvent event) {

    }


    public void initialize() {
        // TODO
    }
}
