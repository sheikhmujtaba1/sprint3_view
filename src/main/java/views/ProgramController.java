package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.navigation_model;

public class ProgramController
{
	navigation_model model;
	
	public void setModel(navigation_model new_model)
	{
		model = new_model;
	}

	@FXML
    private Button userButton;

    @FXML
    void OnClickUser(ActionEvent event) {
    	System.out.println("model.user_display();");
    	model.user_display();
    }
	
}
