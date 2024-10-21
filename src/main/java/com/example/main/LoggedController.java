package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.awt.MenuItem;

public class LoggedController {
    Alert a = new Alert(Alert.AlertType.NONE);
    TilePane r = new TilePane();

    @FXML
    public Button backBoton;
    public TabPane inventory;
    public ToolBar inventoryBar,reservationsBar;
    public javafx.scene.control.ScrollPane inventoryScroll;
    public SplitPane reservationsPane;

    @FXML
    protected void backHome() {
        Stage stage = (Stage) backBoton.getScene().getWindow();
        stage.close();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginandregister_view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage mainStage = new Stage();
            mainStage.getIcons().add(new Image("C:\\Users\\Abraham.chicaiza\\IdeaProjects\\Main\\src\\main\\java\\com\\example\\main\\image\\Logo.png"));
            mainStage.setScene(scene);
            mainStage.setTitle("Cartas App 😃");
            mainStage.setResizable(false);
            mainStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showInventory(){
        inventory.setVisible(true);
        inventoryScroll.setVisible(true);
        inventoryBar.setVisible(true);
        reservationsPane.setVisible(false);
        reservationsBar.setVisible(false);
    }
    public void showReservations(ActionEvent actionEvent){
        inventory.setVisible(false);
        inventoryScroll.setVisible(false);
        inventoryBar.setVisible(false);
        reservationsPane.setVisible(true);
        reservationsBar.setVisible(true);
    }
    public void tableView(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("table_view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage tableStage = new Stage();
            tableStage.getIcons().add(new Image("C:\\Users\\Abraham.chicaiza\\IdeaProjects\\Main\\src\\main\\java\\com\\example\\main\\image\\Logo.png"));
            tableStage.setScene(scene);
            tableStage.setTitle("Table controller 😃");
            tableStage.setResizable(false);
            tableStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void reservationView(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("reservation_view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage reservationStage = new Stage();
            reservationStage.getIcons().add(new Image("C:\\Users\\Abraham.chicaiza\\IdeaProjects\\Main\\src\\main\\java\\com\\example\\main\\image\\Logo.png"));
            reservationStage.setScene(scene);
            reservationStage.setTitle("Reservation controller 😃");
            reservationStage.setResizable(false);
            reservationStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addMesa(ActionEvent actionEvent){


    }


    public void deleteMesa(ActionEvent actionEvent) {

    }

    public void addReserva(ActionEvent actionEvent) {

    }

    public void deleteReserva(ActionEvent actionEvent) {
    }
}
