package views;

//import javax.swing.event.ChangeListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.navigation_model;
import javafx.stage.Stage;

public class LoginController
{
	navigation_model model;
	
	
	public void setModel(navigation_model newModel)
	{
		model = newModel;
	}
	
	private Stage stage;
	
	@FXML
	private Button loginButton;
	
	@FXML 
	private Button registerButton;

	@FXML
	private PasswordField passwordPasswordField;
	
	@FXML
	private TextField usernameTextBox;
	
	

	@FXML
	void onClickLogin(ActionEvent event) 
	{
		System.out.println("model.login();");
		model.login();
	}
	
	public void launchProgramScreen(Stage stage)
	{
		this.stage = stage;

		
		
		double prefHeight = 684;
		double prefWidth = 1216;
		
		stage.widthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
				stage.setWidth(prefWidth);
			}
		});
		
		
		stage.setHeight(prefHeight);
		//stage.setWidth(prefWidth);
         //Don't forget to add below code in every controller
         stage.hide();
         stage.show();
	}
	
}
