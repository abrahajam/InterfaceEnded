package com.example.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class RegisterController {
    @FXML
    public Button backBoton, RegisterBoton;
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
    @FXML
    protected void userRegister() {
        Stage stage = (Stage) RegisterBoton.getScene().getWindow();
        stage.close();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginandregister_view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage mainStage = new Stage();
            mainStage.getIcons().add(new Image("C:\\Users\\Abraham.chicaiza\\IdeaProjects\\Main\\src\\main\\java\\com\\example\\main\\image\\Logo.png"));
            mainStage.setScene(scene);
            mainStage.setTitle("User registred 🎉🎉");
            mainStage.setResizable(false);
            mainStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
