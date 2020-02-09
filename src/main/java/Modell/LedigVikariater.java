package Modell;

import javafx.collections.ObservableList;

public class LedigVikariater {

    private String offentlig;
    private String privat;
    private String arbeidssted;
    private String arbeidsgiver;
    private String jobbkategori;
    private String engasjementets;
    private String  varighetFra;
    private String  varighetTil;
    private String arbeidstidFra;
    private String arbeidstidTil;
    private String Stillingstype;

    public LedigVikariater(String offentlig, String privat, String arbeidssted, String arbeidsgiver, ObservableList<String> items, ObservableList<?> dagFraItems, ObservableList<?> mndFraItems, ObservableList<?> årFraItems, Object value, Object mndTilValue, Object årTilValue, Object klokkaFraValue, Object minuttFraValue, Object klokkaTilValue, Object minuttTilValue, ObservableList<String> stillingstypeItems, String jobbkategori,
                           String engasjementets, String varighetFra, String varighetTil, String arbeidstidFra, String arbeidstidTil, String stillingstype, String text) {
        this.offentlig = offentlig;
        this.privat = privat;
        this.arbeidssted = arbeidssted;
        this.arbeidsgiver = arbeidsgiver;
        this.jobbkategori = jobbkategori;
        this.engasjementets = engasjementets;
        this.varighetFra = varighetFra;
        this.varighetTil = varighetTil;
        this.arbeidstidFra = arbeidstidFra;
        this.arbeidstidTil = arbeidstidTil;
        Stillingstype = stillingstype;
    }

    public String getOffentlig() {
        return offentlig;
    }

    public void setOffentlig(String offentlig) {
        this.offentlig = offentlig;
    }

    public String getPrivat() {
        return privat;
    }

    public void setPrivat(String privat) {
        this.privat = privat;
    }

    public String getArbeidssted() {
        return arbeidssted;
    }

    public void setArbeidssted(String arbeidssted) {
        this.arbeidssted = arbeidssted;
    }

    public String getArbeidsgiver() {
        return arbeidsgiver;
    }

    public void setArbeidsgiver(String arbeidsgiver) {
        this.arbeidsgiver = arbeidsgiver;
    }

    public String getJobbkategori() {
        return jobbkategori;
    }

    public void setJobbkategori(String jobbkategori) {
        this.jobbkategori = jobbkategori;
    }

    public String getEngasjementets() {
        return engasjementets;
    }

    public void setEngasjementets(String engasjementets) {
        this.engasjementets = engasjementets;
    }

    public String getVarighetFra() {
        return varighetFra;
    }

    public void setVarighetFra(String varighetFra) {
        this.varighetFra = varighetFra;
    }

    public String getVarighetTil() {
        return varighetTil;
    }

    public void setVarighetTil(String varighetTil) {
        this.varighetTil = varighetTil;
    }

    public String getArbeidstidFra() {
        return arbeidstidFra;
    }

    public void setArbeidstidFra(String arbeidstidFra) {
        this.arbeidstidFra = arbeidstidFra;
    }

    public String getArbeidstidTil() {
        return arbeidstidTil;
    }

    public void setArbeidstidTil(String arbeidstidTil) {
        this.arbeidstidTil = arbeidstidTil;
    }

    public String getStillingstype() {
        return Stillingstype;
    }

    public void setStillingstype(String stillingstype) {
        Stillingstype = stillingstype;
    }

    @Override
    public String toString() {
        return "LedigVikariater{" +
                "offentlig='" + offentlig + '\'' +
                ", privat='" + privat + '\'' +
                ", arbeidssted='" + arbeidssted + '\'' +
                ", arbeidsgiver='" + arbeidsgiver + '\'' +
                ", jobbkategori='" + jobbkategori + '\'' +
                ", engasjementets='" + engasjementets + '\'' +
                ", varighetFra='" + varighetFra + '\'' +
                ", varighetTil='" + varighetTil + '\'' +
                ", arbeidstidFra='" + arbeidstidFra + '\'' +
                ", arbeidstidTil='" + arbeidstidTil + '\'' +
                ", Stillingstype='" + Stillingstype + '\'' +
                '}';
    }
}
