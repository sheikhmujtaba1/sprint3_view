package model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import views.ProgramController;
import views.UserController;

public class navigation_model
{
	
	BorderPane loginview;
	
	public navigation_model(BorderPane view)
	{
		loginview = view;
	}
	
	
	public void login()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(navigation_model.class.getResource("../views/program_page.fxml"));
		try
		{
			Pane view = loader.load();
			loginview.setCenter(view);
			ProgramController cont = loader.getController();
			cont.setModel(this);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void user_display()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(navigation_model.class.getResource("../views/user_page.fxml"));
		try
		{
			Pane view = loader.load();
			loginview.setCenter(view);
			UserController cont = loader.getController();
			cont.setModel(this);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void back_to_program()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(navigation_model.class.getResource("../views/program_page.fxml"));
		try
		{
			Pane view = loader.load();
			loginview.setCenter(view);
			ProgramController cont = loader.getController();
			cont.setModel(this);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
