package client.controllers;


import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseDragEvent;

import javafx.scene.layout.*;

//Helpers
import helpers.ScreenHelper;

public class DashboardController extends BaseController {

	
	@Override
	public Scene loadSceneIntoMemory() {
		StackPane mainPanel = new StackPane();
		
		mainPanel.setOnMouseDragEntered(new EventHandler<MouseDragEvent>() {


			@Override
			public void handle(MouseDragEvent event) {
				// TODO Auto-generated method stub
				System.out.print("AHAHAHA MMAAHAH!");
			}
		});	
		
		return new Scene(mainPanel, ScreenHelper.getMaxWindowWidth(), ScreenHelper.getMaxWindowHeight());
	}

}
