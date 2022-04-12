package model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import main.Main;

public class view_model
{
	
	BorderPane loginview;
	
	public view_model(BorderPane view)
	{
		loginview = view;
	}
	
	
	public void login()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(view_model.class.getResource("../views/program_page.fxml"));
		try
		{
			BorderPane view = loader.load();
			loginview.setCenter(view);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
