package com.example.main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TableController {
    @FXML
    private Button backHome;
    @FXML
    private Pane newMesa, deleteMesa;
    @FXML
    protected void backBoton() {
        Stage stage = (Stage) backHome.getScene().getWindow();
        stage.close();
    }
    public void showNewTable(){
        newMesa.setVisible(true);
        deleteMesa.setVisible(false);
    }
    public void showDeleteTable(){
        newMesa.setVisible(false);
        deleteMesa.setVisible(true);
    }
}
