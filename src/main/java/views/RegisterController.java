package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.navigation_model;

public class RegisterController
{
	navigation_model nav_model;
	
	public void setModel(navigation_model model)
	{
		nav_model = model;
	}
	
	public RegisterController()
	{
		
	}
	
	@FXML
    private Button Back_B;

    @FXML
    private Button Register_B;

    @FXML
    void OnClickBack(ActionEvent event) 
    {
    	nav_model.open_login();
    }

    @FXML
    void OnClickRegister(ActionEvent event) 
    {
    	nav_model.open_login();
    }

	
	
}
