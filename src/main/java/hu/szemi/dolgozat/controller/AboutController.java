/*
* File: AboutController.java
* Author: Nagy Szemere
* Copyright: 2026, Nagy Szemere
* Group: Szoft I/N
* Date: 2026-05-26
* Github: https://github.com/szetyix
* Licenc: MIT
*/
package hu.szemi.dolgozat.controller;

import hu.szemi.dolgozat.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AboutController {

    @FXML
    private Label nameLabel;

    @FXML
    private Label groupLabel;

    @FXML
    private Label dateLabel;

    private App app;

    @FXML
    private void initialize() {
        nameLabel.setText("Név: Nagy Szemere");
        groupLabel.setText("Csoport: Szoft I/N");
        dateLabel.setText("Készítés dátuma: 2026-05-26");
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void backToMain(ActionEvent event) throws IOException {
        app.showMainScene();
    }
}
