package model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import views.AddChannelController;
import views.AddProgramController;
import views.AddUserController;
import views.LoginController;
import views.ProgramController;
import views.RegisterController;
import views.UserController;

public class navigation_model
{
	
	BorderPane loginview;
	data_model d_m;
	Stage stage;
	
	public navigation_model(BorderPane view, Stage newStage)
	{
		loginview = view;
		d_m = new data_model();
		d_m.add_program("P1");
		d_m.add_program("P2");
		
		d_m.add_channel("Channel 1");
		d_m.add_channel("Channel 2");
		d_m.add_channel("Channel 3");
		
		d_m.add_message("Welcome to Concord! We're excited to have you here!");
		d_m.add_message("This label is going to be really long for testing purposes, and I mean REALLY long. I need it to stretch across the page so I see what it looks like when a label overflows into the next line.");
		d_m.add_message("Type a message below to get started.");
		d_m.add_message("Concord is a BBB product. All rights reserved.");
		
		d_m.add_user("Dr. Bradshaunious");
		d_m.add_user("Eli ganooch");
		
		stage = newStage;
		
	}
	
	
	public void open_program()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(navigation_model.class.getResource("../views/program_page.fxml"));
		try
		{
			int width = 1216;
			int height = 684;
			stage.setWidth(width);
			stage.setHeight(height);
			
			// this centers the window on the screen while avoiding the flashing bug of
			// stage.centerOnScreen();
			javafx.geometry.Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		    stage.setX((screenBounds.getWidth() - width) / 2); 
		    stage.setY((screenBounds.getHeight() - height) / 2);  
		    
		    
			Pane view = loader.load();
			loginview.setCenter(view);
			ProgramController cont = loader.getController();
			cont.setModel(this, d_m);
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
			cont.setModel(this, d_m);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registration_display()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(navigation_model.class.getResource("../views/registration_page.fxml"));
		try
		{
			Pane view = loader.load();
			loginview.setCenter(view);
			RegisterController cont = loader.getController();
			cont.setModel(this);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void open_login()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(navigation_model.class.getResource("../views/login_page.fxml"));
		try
		{
			Pane view = loader.load();
			loginview.setCenter(view);
			LoginController cont = loader.getController();
			cont.setModel(this);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void open_AddPrograms()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(navigation_model.class.getResource("../views/add_program_page.fxml"));
		try
		{
			Pane view = loader.load();
			loginview.setCenter(view);
			AddProgramController cont = loader.getController();
			cont.setModel(this, d_m);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void open_AddChannels()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(navigation_model.class.getResource("../views/add_channel_page.fxml"));
		try
		{
			Pane view = loader.load();
			loginview.setCenter(view);
			AddChannelController cont = loader.getController();
			cont.setModel(this, d_m);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void open_AddUser()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(navigation_model.class.getResource("../views/add_user_page.fxml"));
		try
		{
			Pane view = loader.load();
			loginview.setCenter(view);
			AddUserController cont = loader.getController();
			cont.setModel(this, d_m);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
