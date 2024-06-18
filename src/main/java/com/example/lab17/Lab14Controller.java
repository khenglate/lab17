package com.example.lab17;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Lab14Controller {
    @FXML
    private Button buttonOne, buttonTwo;

    @FXML
    private TextField TextFieldA, TextFieldB, TextFieldSum;

    @FXML
    private void ButtonCalc(ActionEvent eventOne){
        try{
            int numA = Integer.parseInt(TextFieldA.getText());
            int numB = Integer.parseInt(TextFieldB.getText());
            int res = numA + numB;
            TextFieldSum.setText(String.valueOf(res));
        }
        catch (NumberFormatException var5){
            TextFieldA.setText("");
            TextFieldB.setText("");
            TextFieldSum.setText("Error!");
        }
    }

    @FXML
    private void ButtonClear(ActionEvent eventOne){
        TextFieldA.setText("");
        TextFieldB.setText("");
        TextFieldSum.setText("");
    }
}