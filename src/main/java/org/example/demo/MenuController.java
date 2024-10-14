package org.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    private Button button_Documents;

    @FXML
    private Button button_Users;

    @FXML
    private Button button_BorrowDocument;

    @FXML
    private Button button_Quit;

    @FXML
    private RadioButton radioButton_Document;

    @FXML
    private RadioButton radioButton_Author;

    @FXML
    private RadioButton radioButton_Publisher;

    @FXML
    private RadioButton radioButton_Category;

    @FXML
    private javafx.scene.control.TextField TextField;

    @FXML
    private Button button_Search;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup group = new ToggleGroup();
        radioButton_Author.setToggleGroup(group);
        radioButton_Publisher.setToggleGroup(group);
        radioButton_Category.setToggleGroup(group);
        radioButton_Document.setToggleGroup(group);
    }
}
