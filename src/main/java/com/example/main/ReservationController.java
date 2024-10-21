package com.example.main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ReservationController {
    @FXML
    private Button backHome;
    @FXML
    private Pane newReservaPane, deleteReservaPane;
    @FXML
    protected void backBoton() {
        Stage stage = (Stage) backHome.getScene().getWindow();
        stage.close();
    }

    public void showReservation(){
        newReservaPane.setVisible(true);
        deleteReservaPane.setVisible(false);
    }
    public void deleteReservation(){

    }
}
