package views;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.Main;
import model.Program;
import model.navigation_model;

@ExtendWith(ApplicationExtension.class)
public class Sprint4a_testing
{
	@Start //Before 
	private void start(Stage stage)
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../views/login_page.fxml"));
		BorderPane view;
		try
		{
			view = loader.load();
			LoginController cont = loader.getController();
			navigation_model vm = new navigation_model(view, stage);
			cont.setModel(vm);
			Scene s = new Scene(view);
			
			// using the function we created earlier to convert the stylesheet url to a string, then adding it
			String fontSheet = Main.fileToStylesheetString(new File ("src/main/java/views/style.css"));

			if (fontSheet == null) {
			    //Do Whatever you want with logging/errors/etc.
				System.out.println("CSS sheet not found!");
			} else {
			    s.getStylesheets().add( fontSheet );
			}

			stage.setScene(s);
			stage.show();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insert_username(FxRobot robot, String username)
	{
		robot.clickOn("#username_TF");
		robot.write(username);
	}
	
	public void insert_pass(FxRobot robot, String pass)
	{
		robot.clickOn("#pass_TF");
		robot.write(pass);
	}
	
	
	public void clickButton(FxRobot robot, String css_id)
	{
		robot.clickOn(css_id);
	}
	
	@SuppressWarnings("unchecked")
	ListView<Program> getListView(FxRobot robot)
	{
		return (ListView<Program>) robot.lookup("#Program_LV").queryAll().iterator().next();
	}
	
	@Test
	public void testTransitions(FxRobot robot)
	{
		insert_username(robot, "Eli");
		try
		{
			Thread.sleep(500);
			insert_pass(robot, "pass");
			Thread.sleep(500);
			clickButton(robot, "#loginButton");
			Thread.sleep(1500);
			clickButton(robot, "#user_B");
			Thread.sleep(1500);
			clickButton(robot, "#back_B");
			Thread.sleep(1500);
			
			
			ListView<Program> p_list = getListView(robot);
			assertEquals(p_list.getItems().size(), 2);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testListView(FxRobot robot)
	{
	}
	
	
}