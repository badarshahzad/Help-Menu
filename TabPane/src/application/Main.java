package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		startActivity(primaryStage);
	}
	
	public void startActivity(Stage Stage){
		
		try {

			Parent root = FXMLLoader.load(getClass().getResource("/application/MainWindowLayout.fxml"));
			Scene scene = new Scene(root,1400,800);
			
			scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());
			//Get the size fo screen
			Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

	        //set Stage boundaries to visible bounds of the main screen
	        Stage.setX(primaryScreenBounds.getMinX());
	        Stage.setY(primaryScreenBounds.getMinY());
	        Stage.setWidth(primaryScreenBounds.getWidth());
	        Stage.setHeight(primaryScreenBounds.getHeight());

			Stage.setScene(scene);
			Stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	
	public static void main(String[] args) {
		launch(args);
	}
}