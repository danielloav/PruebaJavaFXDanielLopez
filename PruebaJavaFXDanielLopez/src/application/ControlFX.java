package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {

	public void sendStage() {
		abrirSend();
	}

	public void closeStage(){
		System.exit(0);
	}
	public void abrirSend() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainFX.class.getResource("/vista/Send.fxml"));
		try {
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("Formulario");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();
		} catch (IOException e) {
			System.out.println("error en abrirSend");
		}
	}
}
