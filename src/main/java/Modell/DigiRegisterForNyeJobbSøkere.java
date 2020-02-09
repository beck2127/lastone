package Modell;



import javafx.collections.ObservableList;

import java.time.LocalDate;


public class DigiRegisterForNyeJobbSøkere {

    private String kontaktNavn;
    private String adresse;
    private String lønnskarav;
    private String tlf;
    private LocalDate føde;
    private String jobbKategori;
    private String  utdannelse;
    private String erfaring;
    private String  referanser;

    public DigiRegisterForNyeJobbSøkere(String navn, String adresse, String lønnskarav, String tlf, LocalDate fødsesldato,
                                        ObservableList<String> jobbKategori, ObservableList<String> utdannelse, String jobberfaring, String referanser) {
        this.kontaktNavn = navn;
        this.adresse = adresse;
        this.lønnskarav = lønnskarav;
        this.tlf = tlf;
        this.føde = fødsesldato;
        this.jobbKategori = jobbKategori;
        this.utdannelse = utdannelse;
        this.erfaring = jobberfaring;
        this.referanser = referanser;
    }



    public String getKontaktNavn() {
        return kontaktNavn;
    }

    public void setKontaktNavn(String kontaktNavn) {
        this.kontaktNavn = kontaktNavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLønnskarav() {
        return lønnskarav;
    }

    public void setLønnskarav(String lønnskarav) {
        this.lønnskarav = lønnskarav;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public LocalDate getFødsesldato() {
        return føde;
    }

    public void setFødsesldato(LocalDate fødsesldato) {
        this.føde = fødsesldato;
    }

    public String getØnsketJobbKategori() {
        return jobbKategori;
    }

    public void setIobbKategori(String jobbKategori) {
        this.jobbKategori = jobbKategori;
    }

    public String getUtdannelse() {
        return utdannelse;
    }

    public void setUtdannelse(String utdannelse) {
        this.utdannelse = utdannelse;
    }

    public String getJobberfaring() {
        return erfaring;
    }

    public void setJobberfaring(String jobberfaring) {
        this.erfaring = jobberfaring;
    }

    public String getReferanser() {
        return referanser;
    }

    public void setReferanser(String referanser) {
        this.referanser = referanser;
    }

    @Override
    public String toString() {
        return "DigiRegisterForNyeJobbSøkere{" +
                "kontaktNavn='" + kontaktNavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", lønnskarav=" + lønnskarav +
                ", telefon='" + tlf + '\'' +
                ", fødsesldato=" + føde +
                ", ønsketJobbKategori='" + jobbKategori + '\'' +
                ", utdannelse='" + utdannelse + '\'' +
                ", jobberfaring='" + erfaring + '\'' +
                ", referanser='" + referanser + '\'' +
                '}';
    }
}
