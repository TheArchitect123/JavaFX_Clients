package client;

//JavaFX Controls & UI Toolkit
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Constants
import constants.AppInformation;

//Helpers
import helpers.*;

public class ApplicationMngr extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {

		//Add the pages that belong to this primary stage
		primaryStage.setTitle("Hello World!");
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			final String test = "Hello World!";
			@Override        
			public void handle(ActionEvent event) {          
				System.out.println(test);
			}
		});       
		
		
		primaryStage.show();
	}

	public void initializeApplication(String[] args) {
		ApplicationMngr.launch(args);
	}
}
