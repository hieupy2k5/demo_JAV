package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class LoggedInController {
    @FXML
    private TextField username;

    @FXML
    public void cancelButtonClicked(ActionEvent event) {
        System.exit(0);
    }
}
