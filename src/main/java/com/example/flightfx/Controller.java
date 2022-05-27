package com.example.flightfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    @FXML
    public Button closeButton;

    @FXML
    protected void onFirstButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fx1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Search By Airport");
        stage.getIcons().add(new Image("logo.png"));
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onSecondButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fx2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Search by Route");
        stage.getIcons().add(new Image("logo.png"));
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onThirdButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fx3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Search by Route");
        stage.getIcons().add(new Image("logo.png"));
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void closeButtonAction() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
//
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        Stage nstage = new Stage();
//        nstage.setTitle("HOME");
//        nstage.setScene(scene);
//        nstage.show();
    }
}