package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.data_model;
import model.navigation_model;

public class AddChannelController
{
	navigation_model nav_model;
	data_model dm;
	
	public void setModel(navigation_model model, data_model d_m)
	{
		nav_model = model;
		dm = d_m;
	}

	@FXML
    private Button Cancel_B;

    @FXML
    void onClickCancel(ActionEvent event) 
    {
    	nav_model.open_program();
    }
}
