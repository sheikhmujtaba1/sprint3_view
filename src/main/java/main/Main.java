package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.navigation_model;
import views.LoginController;

public class Main extends Application
{

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
		stage.setScene(s);
		stage.show();

	}

	
	public static void main(String[] args)
	{
		launch(args);
	}
}
