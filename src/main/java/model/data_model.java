package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class data_model
{
	public ObservableList<Program> program_list  = FXCollections.observableArrayList();
		
	public data_model()
	{
		
	}
	
	public void add_program(String p_name)
	{
		program_list.add(new Program(p_name));
	}
	
	

}
