package ch.makery.address;

import ch.makery.address.model.Kund;
import ch.makery.address.view.PersonEditDialogController;
import ch.makery.address.view.PersonOverviewController;
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<Kund> kundData = FXCollections.observableArrayList();

    public MainApp() {
        kundData.add(new Kund(1, "hej123", "Josef Dahlgren", "Skolgatan 5", "Josef.Dahlgren@email.se", "0727788991", "Sverige", "Ja", "Nej"));
        kundData.add(new Kund(2, "hej123", "Beatrice Eliasson", "Nattsländevägen 6", "Beatrice.Eliasson@email.se", "0727788992", "Sverige", "Ja", "Nej"));
        kundData.add(new Kund(3, "hej123", "Viola Andersson", "Äpplegatan 5", "Viola.Andersson@email.se", "0727788993", "Sverige", "Ja", "Ja"));
        kundData.add(new Kund(4, "hej123", "Katrina Immonen", "Kungsgatan 1", "Katrina.Immonen@email.se", "0727788994", "Sverige", "Ja", "Ja"));
        kundData.add(new Kund(5, "hej123", "Johan Johansson", "Bögatan 27", "Johan.Johansson@email.se", "0727788995", "Sverige", "Nej", "Nej"));

    }

    public ObservableList<Kund> getKundData() {
        return kundData;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showPersonOverview();
    }

    public void initRootLayout() {
        try {
           
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            RootLayoutController controller = loader.getController();
            controller.setMainApp(this);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    File file = getPersonFilePath();
    if (file != null) {
        loadPersonDataFromFile(file);
    }
}

    public void showPersonOverview() {
    try {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
        AnchorPane personOverview = (AnchorPane) loader.load();

        rootLayout.setCenter(personOverview);

        PersonOverviewController controller = loader.getController();
        controller.setMainApp(this);

    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public boolean showPersonEditDialog(Kund kund) {
    try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/PersonEditDialog.fxml"));
        AnchorPane page = (AnchorPane) loader.load();

        Stage dialogStage = new Stage();
        dialogStage.setTitle("Lägg till Kund");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(primaryStage);
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);

        PersonEditDialogController controller = loader.getController();
        controller.setDialogStage(dialogStage);
        controller.setKund(kund);

        dialogStage.showAndWait();

        return controller.isOkClicked();
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
}

    public static void main(String[] args) {
        launch(args);
    }
}