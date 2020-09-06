package client.controllers;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

import javafx.stage.Stage;

//Helpers
import helpers.ScreenHelper;

public class DashboardController extends BaseController {

	//public ListView DataList;
	
	@Override
	Scene loadSceneIntoMemory() {
		StackPane mainPanel = new StackPane();
		mainPanel.setOnMouseDragEntered(new EventHandler<Event>() {

			
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				
			}
		});	
		
		return new Scene(mainPanel, ScreenHelper.getMaxWindowWidth(), ScreenHelper.getMaxWindowHeight());
	}

}
