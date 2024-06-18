package com.example.lab17;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Lab14Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Lab14.fxml"));
        stage.setTitle("Lab14 Window");
        stage.setScene(new Scene(root, 320, 240));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}