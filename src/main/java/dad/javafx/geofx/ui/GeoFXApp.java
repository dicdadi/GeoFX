package dad.javafx.geofx.ui;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeoFXApp extends Application {
	
	private GeoFXController vista_geofx; 
	@Override
	public void start(Stage primaryStage) throws Exception {
		vista_geofx= new GeoFXController();
		Scene scene = new Scene(vista_geofx.getView());
		
		primaryStage.setTitle("GeoFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	

	public static void main(String[] args) {
	launch(args);

	}

}
