package ch.makery.address.view;

import ch.makery.address.MainApp;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;

public class RootLayoutController {

    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    public RootLayoutController() {

    }
    @FXML
    private void initialize() {
        
    }

    @FXML
    private void handleNew() {
        mainApp.getKundData().clear();
        //mainApp.setKundFilePath(null);
    }

    @FXML
    private void handleOpen() {
        FileChooser fileChooser = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
                "XML files (*.xml)", "*.xml");
        fileChooser.getExtensionFilters().add(extFilter);

        File file = fileChooser.showOpenDialog(mainApp.getPrimaryStage());

        /*if (file != null) {
            mainApp.loadKundDataFromFile(file);
        }*/
    }

    /*@FXML
    private void handleSave() {
        File kundFile = mainApp.getKundFilePath();
        if (kundFile != null) {
            mainApp.saveKundDataToFile(kundFile);
        } else {
            handleSaveAs();
        }
    }*/

    /*@FXML
    private void handleSaveAs() {
        FileChooser fileChooser = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
                "XML files (*.xml)", "*.xml");
        fileChooser.getExtensionFilters().add(extFilter);

        File file = fileChooser.showSaveDialog(mainApp.getPrimaryStage());

        if (file != null) {
            if (!file.getPath().endsWith(".xml")) {
                file = new File(file.getPath() + ".xml");
            }
            mainApp.saveKundDataToFile(file);
        }
    }*/

    @FXML
    private void handleAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("AddressApp");
        alert.setHeaderText("About");
        alert.setContentText("Author: Marco Jakob\nWebsite: http://code.makery.ch");

        alert.showAndWait();
    }

    @FXML
    private void handleExit() {
        System.exit(0);
    }
}