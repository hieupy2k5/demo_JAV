package org.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
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

    @FXML
    private javafx.scene.control.Label label_Search;

    @FXML
    private ImageView imageView_Search;

    private ToggleGroup group;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Common initialization logic for radio buttons
        group = new ToggleGroup();
        radioButton_Author.setToggleGroup(group);
        radioButton_Publisher.setToggleGroup(group);
        radioButton_Category.setToggleGroup(group);
        radioButton_Document.setToggleGroup(group);

        radioButton_Document.setSelected(true);

        group.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) newValue;
                String selectedText = selectedRadioButton.getText();
                TextField.setPromptText("Enter " + selectedText + " name");
            }
        });

        button_Documents.setOnAction(event -> handleDocuments());
        button_Users.setOnAction(event -> handleUsers());
        button_BorrowDocument.setOnAction(event -> handleBorrowDocument());
        button_Quit.setOnAction(event -> handleQuit());
        button_Search.setOnAction(event -> handleSearch());
    }

    private void handleDocuments() {
        System.out.println("Xử lý Documents");
        hideSearchPanel();

        // Thêm các xử lý logic khác cho Documents ở đây
    }

    // Phương thức xử lý khi nhấn nút Users
    private void handleUsers() {
        System.out.println("Xử lý Users");
        hideSearchPanel();

        // Thêm các xử lý logic khác cho Users ở đây
    }

    // Phương thức xử lý khi nhấn nút Borrow Document
    private void handleBorrowDocument() {
        System.out.println("Xử lý Borrow Document");
        hideSearchPanel();

        // Thêm các xử lý logic khác cho Borrow Document ở đây
    }

    protected void handleQuit() {
        System.out.println("Quit button clicked");
        System.exit(0);
    }

    protected void handleSearch() {
        String searchText = TextField.getText();
        RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
        String searchCategory = selectedRadioButton.getText();
        System.out.println("Searching for " + searchText + " in category " + searchCategory);
    }

    private void hideSearchPanel() {
        button_Search.setVisible(false);
        TextField.setVisible(false);
        radioButton_Author.setVisible(false);
        radioButton_Publisher.setVisible(false);
        radioButton_Category.setVisible(false);
        radioButton_Document.setVisible(false);
        label_Search.setVisible(false);
        imageView_Search.setVisible(false);
    }
}