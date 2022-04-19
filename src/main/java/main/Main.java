package main;

import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.navigation_model;
import views.LoginController;

public class Main extends Application
{

	//This function is so we can use our css stylesheet, it convert the url to a string
	//https://stackoverflow.com/questions/33434588/eclipse-javafx-css-resource-not-found
	public static String fileToStylesheetString (File stylesheetFile) {
	    try {
	        return stylesheetFile.toURI().toURL().toString();
	    } catch ( MalformedURLException e ) {
	        return null;
	    }
	}
	
	
	@Override
	public void start(Stage stage) throws Exception
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../views/login_page.fxml"));
		BorderPane view = loader.load();
		LoginController cont = loader.getController();
		navigation_model vm = new navigation_model(view);
		cont.setModel(vm);
		
		
		
	
		
		
		Scene s = new Scene(view);
		
		
		// using the function we created earlier to convert the stylesheet url to a string, then adding it
		String fontSheet = fileToStylesheetString(new File ("src/main/java/views/style.css"));

		if (fontSheet == null) {
		    //Do Whatever you want with logging/errors/etc.
			System.out.println("CSS sheet not found!");
		} else {
		    s.getStylesheets().add( fontSheet );
		}

		stage.setScene(s);
		stage.show();

	}

	
	public static void main(String[] args)
	{
		
		
		launch(args);
	}
}
