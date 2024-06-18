package com.example.lab17;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Lab15Controller {
    @FXML
    private TextField TextFieldNum;

    @FXML
    private Button ButtonPlus, ButtonMinus;

    @FXML
    private int num = 0;

    @FXML
    private void ButtonClickPlus(ActionEvent eventOne){
        if (num < 3){
            ++num;
            TextFieldNum.setText(String.valueOf(num));
        }
    }

    @FXML
    private void ButtonClickMinus(ActionEvent eventOne){
        if (num > -5){
            --num;
            TextFieldNum.setText(String.valueOf(num));
        }
    }
}