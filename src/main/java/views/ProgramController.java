package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import model.Channel;
import model.Program;
import model.data_model;
import model.navigation_model;

public class ProgramController
{
	navigation_model model;
	data_model d_m;
	
	@FXML
    private ListView<?> Program_LV;
	
	@FXML
	private ListView<?> channel_LV;
	 
	@FXML
    private Button userButton;

	
	public void setModel(navigation_model new_model, data_model new_dm)
	{
		model = new_model;
		d_m = new_dm;
		@SuppressWarnings("unchecked")
		ListView<Program> p = (ListView<Program>) Program_LV;
		p.setItems(d_m.program_list);
		
		@SuppressWarnings("unchecked")
		ListView<Channel> c = (ListView<Channel>) channel_LV;
		c.setItems(d_m.channel_list);
		
	}

	
    @FXML
    void OnClickUser(ActionEvent event) 
    {
    	model.user_display();
    }
    
	
    
}
