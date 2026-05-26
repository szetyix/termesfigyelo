/*
* File: MainController.java
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

public class MainController {

    private App app;

    public void setApp(App app) {
        this.app = app;
    }

    public void openAbout(ActionEvent event) throws IOException {
        app.showAboutScene();
    }

    public void openData(ActionEvent event) throws IOException {
        app.showDataScene();
    }
}
