package ch.makery.address.model;

import javafx.beans.property.IntegerProperty;
//import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
//import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Kund{

    private final IntegerProperty kundNr;
    private final StringProperty losenord;
    private final StringProperty namn;
    private final StringProperty adress;
    private final StringProperty email;
    private final StringProperty telefon;
    private final StringProperty land;
    private final StringProperty medlem;
    private final StringProperty medarbetare;

    public Kund(){ 
        this(0, null, null, null, null, null, null, null, null);
    }
    
    public Kund(int kundNr, String losenord, String namn, String adress, String email, String telefon, String land, String medlem, String medarbetare){
        this.kundNr = new SimpleIntegerProperty(kundNr);
        this.losenord = new SimpleStringProperty(losenord);
        this.namn = new SimpleStringProperty(namn);
        this.adress = new SimpleStringProperty(adress);
        this.email = new SimpleStringProperty(email);
        this.telefon = new SimpleStringProperty(telefon);
        this.land = new SimpleStringProperty(land);
        this.medlem = new SimpleStringProperty(medlem);
        this.medarbetare = new SimpleStringProperty(medarbetare);
    
    }

    public int getKundNr() {
        return kundNr.get();
    }

    public void setKundNr(int kundNr) {
        this.kundNr.set(kundNr);
    }

    public IntegerProperty kundNrProperty() {
        return kundNr;
    }
    
    public String getLosen() {
        return losenord.get();
    }

    public void setLosen(String losenord) {
        this.losenord.set(losenord);
    }

    public StringProperty losenProperty() {
        return losenord;
    }

    public String getNamn() {
        return namn.get();
    }

    public void setNamn(String namn) {
        this.namn.set(namn);
    }

    public StringProperty namnProperty() {
        return namn;
    }

    public String getAdress() {
        return adress.get();
    }

    public void setAdress(String adress) {
        this.adress.set(adress);
    }

    public StringProperty adressProperty() {
        return adress;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return email;
    }

    public String getTelefon() {
        return telefon.get();
    }

    public void setTelefon(String telefon) {
        this.telefon.set(telefon);
    }

    public StringProperty telefonProperty() {
        return telefon;
    }

    public String getLand() {
        return land.get();
    }

    public void setLand(String land) {
        this.land.set(land);
    }

    public StringProperty landProperty() {
        return land;
    }

       public String getMedlem() {
        return medlem.get();
    }

    public void setMedlem(String medlem) {
        this.medlem.set(medlem);
    }

    public StringProperty medlemProperty() {
        return medlem;
    }

       public String getMedarbetare() {
        return medarbetare.get();
    }

    public void setMedarbetare(String medarbetare) {
        this.medarbetare.set(medarbetare);
    }

    public StringProperty medarbetareProperty() {
        return medarbetare;
    }


}