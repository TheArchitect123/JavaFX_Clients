package client;

import client.controllers.*; 

//JavaFX Controls & UI Toolkit
import javafx.stage.Stage;

//Constants
import constants.AppInformation;
import de.saxsys.mvvmfx.guice.MvvmfxGuiceApplication;

public class ApplicationMngr extends MvvmfxGuiceApplication {

	DashboardController _dashboard;

	
	private void initializeControllers() {
		_dashboard = new DashboardController();
	}
	
	private void initializeViewModels() {
		
	}

	public void initializeApplication(String[] args) {
		initializeControllers();
		initializeViewModels();
		ApplicationMngr.launch(args);
	}

	@Override
	public void startMvvmfx(Stage stage) throws Exception {
		stage.setTitle(AppInformation.AppName);
		
		stage.setScene(_dashboard.loadSceneIntoMemory());
		stage.show();
	}
}
