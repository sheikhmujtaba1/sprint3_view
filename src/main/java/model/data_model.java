package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class data_model
{
	public ObservableList<Program> program_list  = FXCollections.observableArrayList();
	public ObservableList<Channel> channel_list  = FXCollections.observableArrayList();
	public ObservableList<Messages> message_list  = FXCollections.observableArrayList();
	public ObservableList<user> user_list  = FXCollections.observableArrayList();
		
	public data_model()
	{
		
	}
	
	public void add_program(String p_name)
	{
		program_list.add(new Program(p_name));
	}
	
	public void add_channel(String c_name)
	{
		channel_list.add(new Channel(c_name));
	}
	
	public void add_message(String msg)
	{
		message_list.add(new Messages(msg));
	}
	
	public void add_user(String username)
	{
		user_list.add(new user(username));
	}

}
