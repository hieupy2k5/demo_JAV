package org.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button signUpButton;

    @FXML
    private Button logInButton;

    @FXML
    private RadioButton Mup;

    @FXML
    private RadioButton Py;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup toggleGroup = new ToggleGroup();
        Mup.setToggleGroup(toggleGroup);
        Py.setToggleGroup(toggleGroup);

        Mup.setSelected(true);

        signUpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String toggleName = ((RadioButton) toggleGroup.getSelectedToggle()).getText();

                if (!username.getText().trim().isEmpty() && !password.getText().trim().isEmpty()) {
                    DBUtils.signUpUser(event, username.getText(), password.getText(), toggleName);
                } else {
                    System.out.println("Username or password is empty");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Please fill in all information to sign up!");
                    alert.show();
                }
            }
        });

        logInButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "hello-view.fxml", "Log in!", null, null);
            }
        });
    }
}
