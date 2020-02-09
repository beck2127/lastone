package org.openjfx;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Modell.DigiRegisterForNyeJobbSøkere;
import Modell.Lagre;
import Modell.LedigVikariater;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class LedigVikariaterController {

    boolean KorrektArbeidsgiver = false;
    boolean  KorrektArbeidssted = false;
    boolean  KorreketVilkår = false;

    boolean  KorreketDagFra = false;
    boolean  KorreketDagTil = false;


    boolean  KorreketMndFra = false;
    boolean  KorreketMndTil = false;

    boolean  KorreketÅrFra = false;
    boolean  KorreketÅtTil = false;

    boolean KorreketKlokkaFra = false;
    boolean KorreketKlokkaTil =false;

    boolean KorreketMinuttFra =false;
    boolean KorreketMinuttTil =false;

    boolean KorreketJobbkategori = false;
    boolean KorreketKontaktinformasjon = false;



    Lagre c = new Lagre();

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private RadioButton Privat;
        @FXML
        private RadioButton Offentlig;

        @FXML
        private Label sektorLabel;

        @FXML
        private Label arbeidsstedLabel;

        @FXML
        private Label arbeidsgiverLabel;

        @FXML
        private Label jobbkategoriLabel;

        @FXML
        private Label varighetfFraLabel;

        @FXML
        private Label arbeidstidLabel;

        @FXML
        private Label stillingstypeLabel;

        @FXML
        private Label KravTilKvalifikasjonerLabel;

        @FXML
        private Label stillingsbeskrivelseLabel;

        @FXML
        private Label arbeidsvilkårLabel;

        @FXML
        private Label kontaktinformasjonLabel;

        @FXML
        private TextField Arbeidssted;

        @FXML
        private TextField Arbeidsgiver;

        @FXML
        private ChoiceBox<String> Jobbkategori;

        @FXML
        private ChoiceBox<String> Stillingstype;

        @FXML
        private ComboBox<String> DagFra;

        @FXML
        private ComboBox<String> MndFra;

        @FXML
        private ComboBox<String> ÅrFra;

        @FXML
        private ComboBox<String> MinuttTil;

        @FXML
        private ComboBox<String> KlokkaFra;

        @FXML
        private TextField Arbeidsvilkår;

        @FXML
        private TextField Lønnsbetingelser;

        @FXML
        private CheckBox Annet;

        @FXML
        private CheckBox Attenår;

        @FXML
        private CheckBox Fagbrev;

        @FXML
        private CheckBox Førekort;

        @FXML
        private CheckBox JobbErfaring;

        @FXML
        private TextField Kontaktinformasjon;

        @FXML
        private TextField Stillingsbeskrivelse;

        @FXML
        private Label lønnsbetingelserLabel;

        @FXML
        private Button Register;

        @FXML
        private Button Tableview;

        @FXML
        private Button Hoved;

        @FXML
        private ComboBox<?> MinuttFra;

        @FXML
        private ComboBox<?> KlokkaTil;

        @FXML
        private Label varighetTilLabel;

        @FXML
        private ComboBox<?> DagTil;

        @FXML
        private ComboBox<?> MndTil;

        @FXML
        private ComboBox<?> ÅrTil;

        @FXML
        void HovedButtonAction(ActionEvent event) {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/org/openjfx/scene.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                Scene scene = new Scene(root, 800, 700);
                stage.setTitle("Ledig Vikariater");
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                System.out.println("Kunne ikke laste opp LedigVikariater.fxml");
                e.printStackTrace();


            }

        }

        @FXML
        void RegisterButtonAction(ActionEvent event) {
            List<Object> obj = new ArrayList<>();
            LedigVikariater ledigVikariater;


            ledigVikariater = new LedigVikariater(Offentlig.getText(), Privat.getText(), Arbeidssted.getText(), Arbeidsgiver.getText(),
                    Jobbkategori.getItems(), DagFra.getItems(), MndFra.getItems(),ÅrFra.getItems(),DagTil.getValue(), MndTil.getValue(),
                    ÅrTil.getValue(),KlokkaFra.getValue(),MinuttFra.getValue(),KlokkaTil.getValue(),MinuttTil.getValue(),
                    Stillingstype.getItems(), Lønnsbetingelser.getText(), Attenår.getAccessibleHelp(),Førekort.getAccessibleHelp(),
                    Fagbrev.getAccessibleHelp(), JobbErfaring.getAccessibleHelp(), Arbeidsvilkår.getText(),Kontaktinformasjon.getText(),
                    Stillingsbeskrivelse.getText());

            obj.add(ledigVikariater);
            c.Lagre_csv(obj);

        }

        @FXML
        void TableviewButtonAction(ActionEvent event) {


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

        @FXML
        void kontaktArbeidsgiverValidation(KeyEvent event) {
            Arbeidsgiver.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (Arbeidsgiver.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        arbeidsgiverLabel.setText("");
                        KorrektArbeidsgiver = true;
                    } else {
                        if (Arbeidsgiver.getText().length() == 0) {
                            Arbeidsgiver.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            Arbeidsgiver.setStyle("-fx-border-color: red");
                            arbeidsgiverLabel.setText("error");
                        }
                    }
                } else {
                    Arbeidsgiver.setStyle("border:red");
                    arbeidsgiverLabel.setText("Name is required");
                }


            });

        }

        @FXML
        void kontaktArbeidsstedValidation(KeyEvent event) {
            Arbeidssted.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (Arbeidssted.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        arbeidsstedLabel.setText("");
                        KorrektArbeidssted = true;
                    } else {
                        if (Arbeidssted.getText().length() == 0) {
                            Arbeidssted.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            Arbeidssted.setStyle("-fx-border-color: red");
                            arbeidsstedLabel.setText("error");
                        }
                    }
                } else {
                    Arbeidssted.setStyle("border:red");
                    arbeidsstedLabel.setText("Name is required");
                }


            });

        }

        @FXML
        void kontaktArbeidsvilkårValidation(KeyEvent event) {
            Arbeidsvilkår.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (Arbeidsvilkår.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        arbeidsvilkårLabel.setText("");
                        KorreketVilkår = true;
                    } else {
                        if (Arbeidsvilkår.getText().length() == 0) {
                            Arbeidsvilkår.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            Arbeidsvilkår.setStyle("-fx-border-color: red");
                            arbeidsvilkårLabel.setText("error");
                        }
                    }
                } else {
                    Arbeidsvilkår.setStyle("border:red");
                    arbeidsvilkårLabel.setText("Adresse is required");
                }

            });

        }

        @FXML
        void kontaktDagFraValidation(KeyEvent event) {
            DagFra.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (DagFra.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        varighetfFraLabel.setText("");
                        KorreketDagFra = true;
                    } else {
                        if (DagFra.getText().length() == 0) {
                            DagFra.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            DagFra.setStyle("-fx-border-color: red");
                            varighetfFraLabel.setText("error");
                        }
                    }
                } else {
                    DagFra.setStyle("border:red");
                    varighetfFraLabel.setText("Adresse is required");
                }

            });

        }

        @FXML
        void kontaktDagTilValidation(KeyEvent event) {
            DagTil.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (DagTil.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        varighetTilLabel.setText("");
                        KorreketDagTil = true;
                    } else {
                        if (DagTil.getText().length() == 0) {
                            DagTil.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            DagTil.setStyle("-fx-border-color: red");
                            varighetTilLabel.setText("error");
                        }
                    }
                } else {
                    DagTil.setStyle("border:red");
                    varighetTilLabel.setText("Adresse is required");
                }

            });

        }

        @FXML
        void kontaktJobbKategoriValidation(KeyEvent event) {

            Jobbkategori.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (Jobbkategori.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        jobbkategoriLabel.setText("");
                        KorreketJobbkategori = true;
                    } else {
                        if (Jobbkategori.getText().length() == 0) {
                            Jobbkategori.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            Jobbkategori.setStyle("-fx-border-color: red");
                            jobbkategoriLabel.setText("error");
                        }
                    }
                } else {
                    Jobbkategori.setStyle("border:red");
                    jobbkategoriLabel.setText("Adresse is required");
                }

            });
        }


        }

        @FXML
        void kontaktKlokkaFraValidation(KeyEvent event) {
            KlokkaFra.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (KlokkaFra.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        arbeidstidLabel.setText("");
                        KorreketKlokkaFra = true;
                    } else {
                        if (KlokkaFra.getText().length() == 0) {
                            KlokkaFra.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            KlokkaFra.setStyle("-fx-border-color: red");
                            arbeidstidLabel.setText("error");
                        }
                    }
                } else {
                    KlokkaFra.setStyle("border:red");
                    arbeidstidLabel.setText("Adresse is required");
                }

            });
        }


        @FXML
        void kontaktKlokkaTilValidation(KeyEvent event) {
            KlokkaTil.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (KlokkaTil.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        arbeidstidLabel.setText("");
                        KorreketKlokkaTil = true;
                    } else {
                        if (KlokkaTil.getText().length() == 0) {
                            KlokkaTil.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            KlokkaTil.setStyle("-fx-border-color: red");
                            arbeidstidLabel.setText("error");
                        }
                    }
                } else {
                    KlokkaTil.setStyle("border:red");
                    arbeidstidLabel.setText("Adresse is required");
                }

            });
        }

        @FXML
        void kontaktInformasjonValidation(KeyEvent event) {
            Kontaktinformasjon.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (Kontaktinformasjon.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        kontaktinformasjonLabel.setText("");
                        KorreketKontaktinformasjon = true;
                    } else {
                        if (Kontaktinformasjon.getText().length() == 0) {
                            Kontaktinformasjon.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            Kontaktinformasjon.setStyle("-fx-border-color: red");
                            kontaktinformasjonLabel.setText("error");
                        }
                    }
                } else {
                    Kontaktinformasjon.setStyle("border:red");
                    kontaktinformasjonLabel.setText("Adresse is required");
                }

            });

        }

        @FXML
        void kontaktLønnsbetingelserValidation(KeyEvent event) {







        }

        @FXML
        void kontaktMinuttFraValidation(KeyEvent event) {

        MinuttFra.focusedProperty().addListener((arg0, oldValue, newValue) -> {
        if (!newValue) {
            if (MinuttFra.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                arbeidstidLabel.setText("");
                KorreketMinuttFra = true;
            } else {
                if (MinuttFra.getText().length() == 0) {
                    MinuttFra.setStyle("-fx-border-color: red");
                    //ContactEmailLabel.setText("Email address field is empty");
                } else {
                    MinuttFra.setStyle("-fx-border-color: red");
                    arbeidstidLabel.setText("error");
                }
            }
        } else {
            MinuttFra.setStyle("border:red");
            arbeidstidLabel.setText("Adresse is required");
        }

    });

        @FXML
        void kontaktMinuttTilValidation(KeyEvent event) {
            MinuttTil.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (MinuttTil.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        arbeidstidLabel.setText("");
                        KorreketMinuttTil = true;
                    } else {
                        if (MinuttTil.getText().length() == 0) {
                            MinuttTil.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            MinuttTil.setStyle("-fx-border-color: red");
                            arbeidstidLabel.setText("error");
                        }
                    }
                } else {
                    MinuttTil.setStyle("border:red");
                    arbeidstidLabel.setText("Adresse is required");
                }

            });

        }

        @FXML
        void kontaktMndFraValidation(KeyEvent event) {

            MndFra.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (MndFra.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        varighetfFraLabel.setText("");
                        KorreketMndFra = true;
                    } else {
                        if (MndFra.getText().length() == 0) {
                            MndFra.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            MndFra.setStyle("-fx-border-color: red");
                            varighetfFraLabel.setText("error");
                        }
                    }
                } else {
                    MndFra.setStyle("border:red");
                    varighetfFraLabel.setText("Adresse is required");
                }

            });

        }

        @FXML
        void kontaktMndTilValidation(KeyEvent event) {
            MndTil.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (MndTil.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        varighetTilLabel.setText("");
                        KorreketMndTil = true;
                    } else {
                        if (MndTil.getText().length() == 0) {
                            MndTil.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            MndTil.setStyle("-fx-border-color: red");
                            varighetTilLabel.setText("error");
                        }
                    }
                } else {
                    MndTil.setStyle("border:red");
                    varighetTilLabel.setText("Adresse is required");
                }

            });
        }

        @FXML
        void kontaktStillingsbeskrivelseValidation(KeyEvent event) {

        }

        @FXML
        void kontaktStillingstypeValidation(KeyEvent event) {

        }

        @FXML
        void kontaktÅrFraValidation(KeyEvent event) {

            ÅrFra.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (ÅrFra.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        varighetfFraLabel.setText("");
                        KorreketÅrFra = true;
                    } else {
                        if (ÅrFra.getText().length() == 0) {
                            ÅrFra.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            ÅrFra.setStyle("-fx-border-color: red");
                            varighetfFraLabel.setText("error");
                        }
                    }
                } else {
                    ÅrFra.setStyle("border:red");
                    varighetfFraLabel.setText("Adresse is required");
                }

            });



        }

        @FXML
        void kontaktÅrTilValidation(KeyEvent event) {
            ÅrTil.focusedProperty().addListener((arg0, oldValue, newValue) -> {
                if (!newValue) {
                    if (ÅrTil.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                        varighetTilLabel.setText("");
                        KorreketÅtTil = true;
                    } else {
                        if (ÅrTil.getText().length() == 0) {
                            ÅrTil.setStyle("-fx-border-color: red");
                            //ContactEmailLabel.setText("Email address field is empty");
                        } else {
                            ÅrTil.setStyle("-fx-border-color: red");
                            varighetTilLabel.setText("error");
                        }
                    }
                } else {
                    ÅrTil.setStyle("border:red");
                    varighetTilLabel.setText("Adresse is required");
                }

            });

        }

        @FXML
        void initialize() {
            assert Privat != null : "fx:id=\"Privat\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert sektorLabel != null : "fx:id=\"sektorLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Offentlig != null : "fx:id=\"Offentlig\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert arbeidsstedLabel != null : "fx:id=\"arbeidsstedLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert arbeidsgiverLabel != null : "fx:id=\"arbeidsgiverLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert jobbkategoriLabel != null : "fx:id=\"jobbkategoriLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert varighetfFraLabel != null : "fx:id=\"varighetfFraLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert arbeidstidLabel != null : "fx:id=\"arbeidstidLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert stillingstypeLabel != null : "fx:id=\"stillingstypeLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert KravTilKvalifikasjonerLabel != null : "fx:id=\"KravTilKvalifikasjonerLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert stillingsbeskrivelseLabel != null : "fx:id=\"stillingsbeskrivelseLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert arbeidsvilkårLabel != null : "fx:id=\"arbeidsvilkårLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert kontaktinformasjonLabel != null : "fx:id=\"kontaktinformasjonLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Arbeidssted != null : "fx:id=\"Arbeidssted\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Arbeidsgiver != null : "fx:id=\"Arbeidsgiver\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Jobbkategori != null : "fx:id=\"Jobbkategori\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Stillingstype != null : "fx:id=\"Stillingstype\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert DagFra != null : "fx:id=\"DagFra\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert MndFra != null : "fx:id=\"MnfFra\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert ÅrFra != null : "fx:id=\"ÅrFra\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert MinuttTil != null : "fx:id=\"MinuttTil\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert KlokkaFra != null : "fx:id=\"KlokkaFra\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Arbeidsvilkår != null : "fx:id=\"Arbeidsvilkår\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Lønnsbetingelser != null : "fx:id=\"Lønnsbetingelser\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Annet != null : "fx:id=\"Annet\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Attenår != null : "fx:id=\"Attenår\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Fagbrev != null : "fx:id=\"Fagbrev\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Førekort != null : "fx:id=\"Førekort\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert JobbErfaring != null : "fx:id=\"JobbErfaring\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Kontaktinformasjon != null : "fx:id=\"Kontaktinformasjon\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Stillingsbeskrivelse != null : "fx:id=\"Stillingsbeskrivelse\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert lønnsbetingelserLabel != null : "fx:id=\"lønnsbetingelserLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Register != null : "fx:id=\"Register\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Tableview != null : "fx:id=\"Tableview\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert Hoved != null : "fx:id=\"Hoved\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert MinuttFra != null : "fx:id=\"MinuttFra\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert KlokkaTil != null : "fx:id=\"KlokkaTil\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert varighetTilLabel != null : "fx:id=\"varighetTilLabel\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert DagTil != null : "fx:id=\"DagTil\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert MndTil != null : "fx:id=\"MndTil\" was not injected: check your FXML file 'LedigVikariater.fxml'.";
            assert ÅrTil != null : "fx:id=\"ÅrTil\" was not injected: check your FXML file 'LedigVikariater.fxml'.";

        }
    }


