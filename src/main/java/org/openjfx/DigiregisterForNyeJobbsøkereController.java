package org.openjfx;


import Modell.DigiRegisterForNyeJobbSøkere;
import Modell.Lagre;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class DigiregisterForNyeJobbsøkereController{

    boolean KorrektNavn = false;
    boolean KorreketAdresse = false;

    boolean errorKalender = false;
    boolean KorreketKalender = false;

    boolean KorreketTelefon = false;
    boolean KorreketJobbKategori = false;
    boolean KorreketUtdannesle = false;
    boolean KorreketLønnskrav = false;
    boolean KorreketJobbErfaring= false;
    boolean KorreketReferanser = false;



    Lagre f = new Lagre();


    @FXML
    private TextField kontaktNavn;

    @FXML
    private final DatePicker føde = new DatePicker();

    @FXML
    private TextField tlf;

    @FXML
    private TextField adresse;

    @FXML
    private ChoiceBox <String> jobbKategori;


    @FXML
    private ChoiceBox <String> utdannelse;

    @FXML
    private TextField lønn;


    @FXML
    private TextArea erfaring;

    @FXML
    private TextArea referanser;


//--------------Button---------------//

    @FXML
    private Button digiReg;

    @FXML
    private Button digiTable;

    @FXML
    private Button Hoved;

//--------------Label---------------//
    @FXML
    private Label navnLabel;
    @FXML
    private Label tlfLabel;
    @FXML
    private Label adresseLabel;
    @FXML
    private Label jobbKategoriLabel;
    @FXML
    private Label utdannesleLabel;
    @FXML
    private Label lønnskravLabel;
    @FXML
    private Label jobbErfaringLabel;
    @FXML
    private Label referanserLabel;







    public void digiRegButtonPushed() {

        List<Object> obj = new ArrayList<>();
        DigiRegisterForNyeJobbSøkere digiRegister;


        digiRegister = new DigiRegisterForNyeJobbSøkere(kontaktNavn.getText(), adresse.getText(), lønn.getText(), tlf.getText(),
                føde.getValue(), jobbKategori.getItems(), utdannelse.getItems(), erfaring.getText(), referanser.getText());

        obj.add(digiRegister);
        f.Lagre_csv(obj);

    }


    public void digiTableButtonPushed(ActionEvent event) throws IOException {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/org/openjfx/DigiReg-TableView.fxml"));
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


    public void hovedButtonPushed(ActionEvent event) throws IOException {

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
    private void displayFøde(ActionEvent event) {
        LocalDate today = LocalDate.now();
        LocalDate bdate = føde.getValue();
        if (bdate == null || bdate.isAfter(today)) {
        } else {
            String date = String.valueOf(bdate);


        }
    }

    @FXML
    void initialize() {
        assert kontaktNavn != null : "fx:id=\"navn\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";
        assert tlf != null : "fx:id=\"tlf\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";
        assert lønn != null : "fx:id=\"lønn\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";
        assert adresse != null : "fx:id=\"adresse\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";
        assert jobbKategori != null : "fx:id=\"jobbKategori\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";
        assert utdannelse != null : "fx:id=\"utdannelse\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";
        assert føde != null : "fx:id=\"føde\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";
        assert erfaring != null : "fx:id=\"erfaring\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";
        assert referanser != null : "fx:id=\"referanser\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";
        assert digiReg!= null : "fx:id=\"digiLagreButtonPushed\" was not injected: check your FXML file 'Digi-registerForNyeJobbsøkere.fxml'.";


}
    l

    @Override
    public void initialize () {


        digiTable.setText("");
        jobbKategori.getItems().addAll("Salg/merkedsføring", "Advokatt", "IT-konsulent",
                "Bankvirksomhet", "Regnskap", "Resturant/servering", "Olje/Gass7Energi", "Bygg og anlegg", "Eiendom", "Kommunikasjon");

        digiTable.setText("");
        utdannelse.getItems().addAll("VG", "Fagbrev", "Bachelor", "Master");


    }








    //------------------Feilhåndtering-------------------------//


    @FXML
    public void kontaktnavnValidation() {
        kontaktNavn.focusedProperty().addListener((arg0, oldValue, newValue) -> {
            if (!newValue) {
                if (kontaktNavn.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                    navnLabel.setText("");
                    KorrektNavn = true;
                } else {
                    if (kontaktNavn.getText().length() == 0) {
                        kontaktNavn.setStyle("-fx-border-color: red");
                        //ContactEmailLabel.setText("Email address field is empty");
                    } else {
                        kontaktNavn.setStyle("-fx-border-color: red");
                        navnLabel.setText("error");
                    }
                }
            } else {
                kontaktNavn.setStyle("border:red");
                navnLabel.setText("Name is required");
            }


        });
    }

    @FXML
    public void kontaktKalenderValidation() {
        føde.focusedProperty().addListener((arg0, oldValue, newValue) -> {
            if (!newValue) {
                if (føde.getPromptText().length() >= 10) {
                    errorKalender.setText("");
                    KorreketKalender = true;
                } else {
                    errorKalender.setText("error date format");
                }

            } else {
                føde.setStyle("border:red;");
                errorKalender.setText("Please select a date");
            }
        });

    }







    @FXML
    public void kontaktTelefonValidation() {
        tlf.focusedProperty().addListener((arg0, oldValue, newValue) -> {
            if (!newValue) {
                if (tlf.getText().matches("\\d{8}")) {
                    tlfLabel.setText("");
                    KorreketTelefon = true;
                } else {
                    if (tlf.getText().length() == 0) {
                        tlf.setStyle("-fx-border-color: red");
                        // tlfLabel.setText("Phone number field is empty");
                    } else {
                        tlf.setStyle("-fx-border-color: red");
                        tlfLabel.setText("error");
                    }
                }
            } else {
                tlf.setStyle("border:red;");
                tlfLabel.setText("Phone number is required");
            }
        });

    }

      @FXML
        public void kontaktAdresseValidation(){
            adresse.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (adresse.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        adresseLabel.setText("");
                        KorreketAdresse = true;
                    } else {
                        if (adresse.getText().length() == 0) {
                            adresse.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            adresse.setStyle("-fx-border-color: red");
                            adresseLabel.setText("error");
                        }
                    }
                } else {
                    adresse.setStyle("border:red");
                    adresseLabel.setText("Adresse is required");
                }

            });


        }

        @FXML
        public void kontaktJobbKategoriValidation (){
            jobbKategori.focusedProperty().addListener((observable, oldValue, newValue) -> {
                if (!newValue) {
                    if (jobbKategori.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        jobbKategoriLabel.setText("");
                        KorreketJobbKategori = true;
                    } else {
                        if (jobbKategori.setText().length() == 0) {
                            jobbKategori.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            jobbKategori.setStyle("-fx-border-color: red");
                            jobbKategoriLabel.setText("error");
                        }
                    }
                } else {
                    jobbKategori.setStyle("border:red");
                    jobbKategoriLabel.setText("Jobb kategori is required");
                }

            });

        }
        @FXML
        public void kontaktUtdannelseValidation() {
            utdannelse.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (utdannelse.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        utdannesleLabel.setText("");
                        KorreketUtdannesle = true;
                    } else {
                        if (utdannelse.setText().length() == 0) {
                            utdannelse.setStyle("-fx-border-color: red");
                        } else {
                            utdannelse.setStyle("-fx-border-color: red");
                            utdannesleLabel.setText("error");
                        }
                    }
                } else {
                    utdannelse.setStyle("border:red");
                    utdannesleLabel.setText("Utdannesle is required");
                }

            });

        }
        @FXML
        public void kontaktLønnskravValidation(){
            lønn.focusedProperty().addListener((arg0, oldValue, newValue) ->{
                if(!newValue){
                    if(lønn.getText().matches("^[a-zA-Z\\s]{2,50}$")){
                        lønnskravLabel.setText("");
                        KorreketLønnskrav = true;
                    }else{
                        if (lønn.getText().length() == 0){
                            lønn.setStyle("-fx-border-color: red");
                            //kontactNameLabel.setText("Contact name field is empty");
                        }else {
                            lønn.setStyle("-fx-border-color: red");
                            lønnskravLabel.setText("error");
                        }
                    }
                }else {
                    lønn.setStyle("border:red;");
                    lønnskravLabel.setText("Lønn is required");
                }
            });


            }

    @FXML
    public void kontaktJobbErfaringValidation(){
        erfaring.focusedProperty().addListener((arg0, oldValue, newValue) ->{
            if(!newValue){
                if(erfaring.getText().matches("^[a-zA-Z\\s]{2,50}$")){
                    jobbErfaringLabel.setText("");
                    KorreketJobbErfaring = true;
                }else{
                    if (erfaring.getText().length() == 0){
                        erfaring.setStyle("-fx-border-color: red");
                        //kontactNameLabel.setText("Contact name field is empty");
                    }else {
                        erfaring.setStyle("-fx-border-color: red");
                        jobbErfaringLabel.setText("error");
                    }
                }
            }else {
                erfaring.setStyle("border:red;");
                jobbErfaringLabel.setText("Jobb erfaring is required");
            }
        });
    }
    @FXML
    public void kontaktReferanserValidation(){
        referanser.focusedProperty().addListener((arg0, oldValue, newValue) ->{
            if(!newValue){
                if(referanser.getText().matches("\\d{8}")){
                    referanserLabel.setText("");
                    KorreketReferanser = true;
                }else{
                    if (referanser.getText().length() == 0){
                        referanser.setStyle("-fx-border-color: red");
                        // kontactNumberLabel.setText("Phone number field is empty");
                    }else {
                        referanser.setStyle("-fx-border-color: red");
                        referanserLabel.setText("error");
                    }
                }
            }else {
                referanser.setStyle("border:red;");
                referanserLabel.setText("Phone number is required");
            }
        });
    }





}


