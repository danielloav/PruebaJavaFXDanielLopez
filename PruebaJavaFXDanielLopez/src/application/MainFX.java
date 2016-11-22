package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * 
 * @author daniel
 *
 */
public class MainFX extends Application {

	private Stage primaryStage;
	private AnchorPane rootLayout;

	/**
	 * it´s starts and inizializate the window
	 * 
	 * @author daniel
	 * @param primaryStage
	 *            must be a Stage
	 * 
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("My GitHub Profile");
		this.primaryStage.setX(200);
		this.primaryStage.setY(200);
		iniciarVentanas();

	}

	/**
	 * este método inicializa Profile y la muestra
	 * 
	 * @author daniel
	 * @see ControlFX
	 */
	public void iniciarVentanas() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("/vista/Profile.fxml"));

			rootLayout = (AnchorPane) loader.load();
			Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add(getClass().getResource("../vista/css.css").toExternalForm());
			scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Bungee+Inline");
			scene.getStylesheets().add(getClass().getResource("../vista/css.css").toExternalForm());
			scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Ranga");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {

			System.out.println("error en iniciarVentanas " + e.getMessage());
		}

	}

	/**
	 * @author daniel
	 * @return primaryStage
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);

	}
}
