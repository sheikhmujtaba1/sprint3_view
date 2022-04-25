package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Channel;
import model.Messages;
import model.Program;
import model.data_model;
import model.navigation_model;
import model.user;

public class ProgramController
{
	navigation_model model;
	data_model d_m;
	
	@FXML
    private Button AddUsers_B;

    @FXML
    private ListView<?> Message_LV;

    @FXML
    private TextField Msg_TB;

    @FXML
    private ListView<?> Program_LV;

    @FXML
    private Button Send_B;

    @FXML
    private ListView<?> User_LV;

    @FXML
    private Button addChannel_B;

    @FXML
    private Button addProgram_B;

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
		
		@SuppressWarnings("unchecked")
		ListView<Messages> m = (ListView<Messages>) Message_LV;
		m.setItems(d_m.message_list);
		
		
		@SuppressWarnings("unchecked")
		ListView<user> u = (ListView<user>) User_LV;
		u.setItems(d_m.user_list);
		
	}

	
    @FXML
    void OnClickUser(ActionEvent event) 
    {
    	model.user_display();
    }
    
    @FXML
    void OnClickAddProgram(ActionEvent event) 
    {
    	model.open_AddPrograms();
    	
    }
    
    @FXML
    void OnClickAddChannel(ActionEvent event) 
    {
    	model.open_AddChannels();
    }
    
    @FXML
    void OnClickAddUser(ActionEvent event) 
    {
    	model.open_AddUser();
    }

    @FXML
    void OnClickSend(ActionEvent event) 
    {
    	String msg = Msg_TB.textProperty().get();
    	if(msg != "")
    	{
    		d_m.add_message(msg);
        	Msg_TB.setText("");
    	}
    }
	
    
}
