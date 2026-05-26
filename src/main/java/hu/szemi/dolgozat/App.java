/*
* File: App.java
* Author: Nagy Szemere
* Copyright: 2026, Nagy Szemere
* Group: Szoft I/N
* Date: 2026-05-26
* Github: https://github.com/szetyix
* Licenc: MIT
*/
package hu.szemi.dolgozat;

import hu.szemi.dolgozat.controller.AboutController;
import hu.szemi.dolgozat.controller.DataController;
import hu.szemi.dolgozat.controller.MainController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static final String MAIN_VIEW = "/hu/szemi/dolgozat/view/main-view.fxml";
    private static final String ABOUT_VIEW = "/hu/szemi/dolgozat/view/about-view.fxml";
    private static final String DATA_VIEW = "/hu/szemi/dolgozat/view/data-view.fxml";

    private Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Dolgozat - JavaFX");
        showMainScene();
        this.primaryStage.show();
    }

    public void showMainScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(MAIN_VIEW));
        Parent root = loader.load();

        MainController controller = loader.getController();
        controller.setApp(this);

        Scene scene = new Scene(root, 900, 600);
        scene.getStylesheets().add(getClass().getResource("/hu/szemi/dolgozat/style/app.css").toExternalForm());
        primaryStage.setScene(scene);
    }

    public void showAboutScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ABOUT_VIEW));
        Parent root = loader.load();

        AboutController controller = loader.getController();
        controller.setApp(this);

        Scene scene = new Scene(root, 900, 600);
        scene.getStylesheets().add(getClass().getResource("/hu/szemi/dolgozat/style/app.css").toExternalForm());
        primaryStage.setScene(scene);
    }

    public void showDataScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(DATA_VIEW));
        Parent root = loader.load();

        DataController controller = loader.getController();
        controller.setApp(this);
        controller.loadData();

        Scene scene = new Scene(root, 900, 600);
        scene.getStylesheets().add(getClass().getResource("/hu/szemi/dolgozat/style/app.css").toExternalForm());
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}
