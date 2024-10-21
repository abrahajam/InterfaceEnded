package com.example.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainController {

    @FXML
    public Button signupBoton, loginBoton;

    @FXML
    protected void register() {
        Stage stage = (Stage) signupBoton.getScene().getWindow();
        stage.close();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("register_view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage registerStage = new Stage();
            registerStage.getIcons().add(new Image("C:\\Users\\Abraham.chicaiza\\IdeaProjects\\Main\\src\\main\\java\\com\\example\\main\\image\\Logo.png"));
            registerStage.setScene(scene);
            registerStage.setTitle("Register your user :)");
            registerStage.setResizable(false);
            registerStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void login() {
        Stage stage = (Stage) loginBoton.getScene().getWindow();
        stage.close();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("logged_view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage loggedStage = new Stage();
            loggedStage.getIcons().add(new Image("C:\\Users\\Abraham.chicaiza\\IdeaProjects\\Main\\src\\main\\java\\com\\example\\main\\image\\Logo.png"));
            loggedStage.setScene(scene);
            loggedStage.setTitle("Welcome Back 😁😁😁");
            loggedStage.setResizable(false);
            loggedStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}