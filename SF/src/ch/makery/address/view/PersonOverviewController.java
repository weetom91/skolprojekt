package ch.makery.address.view;

import ch.makery.address.MainApp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ch.makery.address.model.Kund;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PersonOverviewController {
    @FXML
    private TableView<Kund> kundTable;
    @FXML
    private TableColumn<Kund, Integer> kundNrColumn;
    @FXML
    private TableColumn<Kund, String> namnColumn;

    @FXML
    private Label kundNrLabel;
    @FXML
    private Label losenLabel;
    @FXML
    private Label namnLabel;
    @FXML
    private Label adressLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label telefonLabel;
    @FXML
    private Label landLabel;
    @FXML
    private Label medlemLabel;
    @FXML
    private Label medarbetareLabel;

    private MainApp mainApp;
    
    public PersonOverviewController() {
    }

    @FXML
    private void initialize() {
        kundNrColumn.setCellValueFactory(cellData -> cellData.getValue().kundNrProperty().asObject());
        namnColumn.setCellValueFactory(cellData -> cellData.getValue().namnProperty());
        
        showKundDetails(null);

        kundTable.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, newValue) -> showKundDetails(newValue));
    }
  

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        kundTable.setItems(mainApp.getKundData());
    }

    @FXML
    private void handleNewKund() {
    Kund tempKund = new Kund();
    boolean okClicked = mainApp.showPersonEditDialog(tempKund);
    if (okClicked) {
        mainApp.getKundData().add(tempKund);
    }
}


    @FXML
    private void handleEditPerson() {
        Kund selectedKund = kundTable.getSelectionModel().getSelectedItem();
        if (selectedKund != null) {
            boolean okClicked = mainApp.showPersonEditDialog(selectedKund);
            if (okClicked) {
                showKundDetails(selectedKund);
            }

    } else {
        Alert alert = new Alert(AlertType.WARNING);
        alert.initOwner(mainApp.getPrimaryStage());
        alert.setTitle("Inget val");
        alert.setHeaderText("Ingen kund vald");
        alert.setContentText("Error! Vänligen välj en kund i tabellen");

        alert.showAndWait();
    }
}

    @FXML
    private void handleDeletePerson(){
    int selectedIndex = kundTable.getSelectionModel().getSelectedIndex();
        if(selectedIndex >=0){  
    
        kundTable.getItems().remove(selectedIndex);
        }else{
            Alert alert = new Alert(AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Error! Inget val");
            alert.setHeaderText("Ingen kund vald");
            alert.setContentText("Välj kund i tabellen");

            alert.showAndWait();
        }
    }

    private void showKundDetails(Kund kund) {
    if (kund != null) {
 
        kundNrLabel.setText(Integer.toString(kund.getKundNr()));
        losenLabel.setText(kund.getLosen());
        namnLabel.setText(kund.getNamn());
        adressLabel.setText(kund.getAdress());
        emailLabel.setText(kund.getEmail());
        telefonLabel.setText(kund.getTelefon());
        landLabel.setText(kund.getLand());
        medlemLabel.setText(kund.getMedlem());
        medarbetareLabel.setText(kund.getMedarbetare());
        
    } else {
        kundNrLabel.setText("");
        losenLabel.setText("");
        namnLabel.setText("");
        adressLabel.setText("");
        emailLabel.setText("");
        telefonLabel.setText("");
        landLabel.setText("");
        medlemLabel.setText("");
        medarbetareLabel.setText("");
    }

    }
}
