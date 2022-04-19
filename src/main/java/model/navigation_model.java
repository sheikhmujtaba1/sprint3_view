package model;

import java.awt.geom.Rectangle2D;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import views.ProgramController;
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
		
		d_m.add_message("Welcome to channel 1");
		d_m.add_message("Word hard play hard");
		d_m.add_message("We ballin' out here");
		
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
			//stage.centerOnScreen();
			
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
			cont.setModel(this);
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
