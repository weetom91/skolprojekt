package ch.makery.address.view;

import ch.makery.address.MainApp;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ch.makery.address.model.Kund;

public class PersonEditDialogController {

    @FXML
    private TextField kundNrField;
    @FXML
    private TextField losenField;
    @FXML
    private TextField namnField;
     @FXML
    private TextField adressField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField telefonField;
    @FXML
    private TextField landField;
    @FXML
    private TextField medlemField;
    @FXML
    private TextField medarbetareField;

    private Stage dialogStage;
    private Kund kund;
    private boolean okClicked = false;

    @FXML
    private void initialize() {
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setKund(Kund kund) {
        this.kund = kund;

        kundNrField.setText(Integer.toString(kund.getKundNr()));
        losenField.setText(kund.getLosen());
        namnField.setText(kund.getNamn());
        adressField.setText(kund.getAdress());
        emailField.setText(kund.getEmail());
        telefonField.setText(kund.getTelefon());
        landField.setText(kund.getLand());
        medlemField.setText(kund.getMedlem());
        medarbetareField.setText(kund.getMedarbetare());
    }

    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    private void handleOk() {
        if (isInputValid()) {

            kund.setKundNr(Integer.parseInt(kundNrField.getText()));
            kund.setLosen(losenField.getText());
            kund.setNamn(namnField.getText());
            kund.setAdress(adressField.getText());
            kund.setEmail(emailField.getText());
            kund.setTelefon(telefonField.getText());
            kund.setLand(landField.getText());
            kund.setMedlem(medlemField.getText());
            kund.setMedarbetare(medarbetareField.getText());
            
            
            okClicked = true;
            dialogStage.close();
        }
    }

    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    private boolean isInputValid() {
        String errorMessage = "";

        if (kundNrField.getText() == null || kundNrField.getText().length() == 0) {
            errorMessage += "Error! Fel inmatning!\n"; 
        }

        if (namnField.getText() == null || namnField.getText().length() == 0) {
            errorMessage += "Error! Fel inmatning!\n"; 
        }

        if (losenField.getText() == null || losenField.getText().length() == 0) {
            errorMessage += "Error! Fel inmatning!\n"; 
        }

        if (adressField.getText() == null || adressField.getText().length() == 0) {
            errorMessage += "Error! Fel inmatning!\n"; 
        }

        if (emailField.getText() == null || emailField.getText().length() == 0) {
            errorMessage += "Error! Fel inmatning!\n"; 
        }

        if (telefonField.getText() == null || telefonField.getText().length() == 0) {
            errorMessage += "Error! Fel inmatning!\n"; 
        }
        
        if (landField.getText() == null || landField.getText().length() == 0) {
            errorMessage += "Error! Fel inmatning!\n"; 
        }

        if (medlemField.getText() == null || medlemField.getText().length() == 0) {
            errorMessage += "Error! Fel inmatning!\n"; 
        }

        if (medarbetareField.getText() == null || medarbetareField.getText().length() == 0) {
            errorMessage += "Error! Fel inmatning!\n"; 
        }
        if (errorMessage.length() == 0) {
            return true;
        } else {

            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Otillåtna inmatningar");
            alert.setHeaderText("Error! Åtgärda inmatningarna");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}
