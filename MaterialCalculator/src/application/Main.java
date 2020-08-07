package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Main extends Application
{

    private Label firstValue;
    private Label secondValue;
    private Label sumLabel;

    @Override
    public void start( Stage myStage) 
    {
    	GridPane pane = new GridPane();
    	
    	
    	
        myStage.setTitle( "Simple Calculator");
        FlowPane rootNode = new FlowPane();        
        Scene myScene = new Scene( rootNode, 300, 200 );           

        
        Label firstValue = new Label( "First Value: ");            
        Label secondValue = new Label( "Second Value: ");          
        Label sumLabel = new Label( "Sum is: ");                   

        TextField firstField = new TextField();                    
        TextField secondField = new TextField();                   
        TextField sumField = new TextField();                      

        
        
        sumField.setEditable(false);                               

        rootNode.getChildren().addAll( firstValue, firstField, secondValue, secondField, sumLabel, sumField);
        myStage.setScene( myScene );                                                                                        
        myStage.show();                                                                                          
    }

    public static void main(String [] args)
    {
        launch( args );                                            
    }

}
