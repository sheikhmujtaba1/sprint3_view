package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController
{
	    @FXML
	    private Button loginButton;

	    @FXML
	    private TextField passwordTextBox;

	    @FXML
	    private TextField usernameTextBox;

	    @FXML
	    void onClickLogin(ActionEvent event) {

	    	System.out.println("Login clicked");
	    }
}
