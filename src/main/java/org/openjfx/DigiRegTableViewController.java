package org.openjfx;


import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import Modell.DigiRegisterForNyeJobbSøkere;
import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class DigiRegTableViewController  {

    @FXML
    private TableView<DigiRegisterForNyeJobbSøkere> tableView;
    @FXML
    private TableColumn<DigiRegisterForNyeJobbSøkere, String> navnColumn;
    @FXML
    private TableColumn<DigiRegisterForNyeJobbSøkere, Integer> telefonColumn;
    @FXML
    private TableColumn<DigiRegisterForNyeJobbSøkere, String> adresseColumn;
    @FXML
    private TableColumn<DigiRegisterForNyeJobbSøkere, LocalDate> fødsesldatoColumn;
    @FXML
    private TableColumn<DigiRegisterForNyeJobbSøkere, String> ønsketJobbKategoriColumn;
    @FXML
    private TableColumn<DigiRegisterForNyeJobbSøkere, String> jobberfaringColumn;
    @FXML
    private TableColumn<DigiRegisterForNyeJobbSøkere, String> utdannelseColumn;
    @FXML
    private TableColumn<DigiRegisterForNyeJobbSøkere, String> referanserColumn;
    @FXML
    private TableColumn<DigiRegisterForNyeJobbSøkere, Double> lønnskravColumn;









    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Endre;

    @FXML
    private Button Slett;

    @FXML
    private Button Hoved;



    @FXML
    void hoved2ButtonAction(ActionEvent event) throws IOException {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/org/openjfx/scene.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            Scene scene = new Scene(root, 800, 700);
            stage.setTitle("Ny Jobbsøker");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.out.println("Kunne ikke laste opp Digi-registerForNyeJobbsøkere.fxml");
            e.printStackTrace();


        }
    }



    @FXML
    void endreButtonAction(ActionEvent event) throws IOException {



    }




        @FXML
        void slettButtonAction (ActionEvent event) throws IOException{




        }

        @FXML
        void initialize () {
            assert Endre != null : "fx:id=\"Endre\" was not injected: check your FXML file 'DigiReg-TableView.fxml'.";
            assert Slett != null : "fx:id=\"Slett\" was not injected: check your FXML file 'DigiReg-TableView.fxml'.";
            assert Hoved != null : "fx:id=\"Hoved\" was not injected: check your FXML file 'DigiReg-TableView.fxml'.";

        }

/*
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        navnColumn.setCellValueFactory(new PropertyValueFactory<DigiRegisterForNyeJobbSøkere, String>(""));
        telefonColumn.setCellValueFactory(new PropertyValueFactory<DigiRegisterForNyeJobbSøkere, Integer>(""));
        adresseColumn.setCellValueFactory(new PropertyValueFactory<DigiRegisterForNyeJobbSøkere, String>(""));
        fødsesldatoColumn.setCellValueFactory(new PropertyValueFactory<DigiRegisterForNyeJobbSøkere, LocalDate>(""));
        ønsketJobbKategoriColumn.setCellValueFactory(new PropertyValueFactory<DigiRegisterForNyeJobbSøkere, String>(""));
        jobberfaringColumn.setCellValueFactory(new PropertyValueFactory<DigiRegisterForNyeJobbSøkere, String>(""));
        utdannelseColumn.setCellValueFactory(new PropertyValueFactory<DigiRegisterForNyeJobbSøkere, String>(""));
        lønnskravColumn.setCellValueFactory(new PropertyValueFactory<DigiRegisterForNyeJobbSøkere, Double>(""));
        referanserColumn.setCellValueFactory(new PropertyValueFactory<DigiRegisterForNyeJobbSøkere, String>(""));

        tableView.setItems(getPeople());
    }
    public ObservableList<DigiRegisterForNyeJobbSøkere> getPeople(){
        ObservableList<DigiRegisterForNyeJobbSøkere> people = FXCollections.observableArrayList();
        people.add(new DigiRegisterForNyeJobbSøkere("" ," "," "," "," "," "," "," "," "));

        return people;

*/





    }



