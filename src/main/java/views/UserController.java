package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.data_model;
import model.navigation_model;

public class UserController
{

	navigation_model model;
	data_model dm;
	
	public void setModel(navigation_model new_model, data_model dm)
	{
		model = new_model;
		this.dm = dm;
		
		Username_L.setText(dm.username);
	}
	
	@FXML
    private Label Username_L;
	
	@FXML
    private Button BackButton;

    @FXML
    void OnClickBack(ActionEvent event)
    {
    	model.open_program();
    }
	
}
