package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.navigation_model;

public class UserController
{

navigation_model model;
	
	public void setModel(navigation_model new_model)
	{
		model = new_model;
	}
	
	@FXML
    private Button BackButton;

    @FXML
    void OnClickBack(ActionEvent event)
    {
    	System.out.println("model.back_to_program();");
    	model.back_to_program();
    }
	
}
