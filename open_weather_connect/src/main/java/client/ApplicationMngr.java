package client;

import client.controllers.*;
import javafx.application.Application;
//JavaFX Controls & UI Toolkit
import javafx.stage.Stage;

//Constants
import constants.AppInformation;

public class ApplicationMngr extends Application {

	DashboardController _dashboard;

	public ApplicationMngr() {
		
	}
	
	private void initializeControllers() {
		_dashboard = new DashboardController();
	}
	
	private void initializeViewModels() {
		
	}

	public void initializeApplication(String[] args) {
		ApplicationMngr.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		initializeControllers();
		initializeViewModels();
		
		primaryStage.setTitle(AppInformation.AppName);
		primaryStage.setScene(_dashboard.loadSceneIntoMemory());
		primaryStage.show();
	}
}
