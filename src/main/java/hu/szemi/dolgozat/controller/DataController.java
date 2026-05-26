/*
* File: DataController.java
* Author: Nagy Szemere
* Copyright: 2026, Nagy Szemere
* Group: Szoft I/N
* Date: 2026-05-26
* Github: https://github.com/szetyix
* Licenc: MIT
*/
package hu.szemi.dolgozat.controller;

import hu.szemi.dolgozat.App;
import hu.szemi.dolgozat.model.Temes;
import hu.szemi.dolgozat.service.TemesLoader;
import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;

public class DataController {

    @FXML
    private TableView<Temes> dataTable;

    @FXML
    private TableColumn<Temes, Integer> idColumn;

    @FXML
    private TableColumn<Temes, String> nevColumn;

    @FXML
    private TableColumn<Temes, String> duloColumn;

    @FXML
    private TableColumn<Temes, Integer> termesColumn;

    @FXML
    private TableColumn<Temes, String> betakaritasColumn;

    private final TemesLoader loader = new TemesLoader();
    private App app;

    @FXML
    private void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nevColumn.setCellValueFactory(new PropertyValueFactory<>("nev"));
        duloColumn.setCellValueFactory(new PropertyValueFactory<>("dulo"));
        termesColumn.setCellValueFactory(new PropertyValueFactory<>("termesQ"));
        betakaritasColumn.setCellValueFactory(new PropertyValueFactory<>("betakaritasVege"));
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void loadData() {
        List<Temes> adatok = loader.loadFromResource("/hu/szemi/dolgozat/data/temesek.txt");
        dataTable.setItems(FXCollections.observableArrayList(adatok));
    }

    public void backToMain(ActionEvent event) throws IOException {
        app.showMainScene();
    }
}
