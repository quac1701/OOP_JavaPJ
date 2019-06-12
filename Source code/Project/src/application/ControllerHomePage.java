package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class ControllerHomePage implements Initializable {

	@FXML
	private AnchorPane pane;

	public void queue() throws IOException {
		AnchorPane child = FXMLLoader
				.load(getClass().getResource("QueuePage.fxml"));
		pane.getChildren().setAll(child);
	}

	public void hashtable() throws IOException {
		AnchorPane child = FXMLLoader
				.load(getClass().getResource("HashTablePage.fxml"));
		pane.getChildren().setAll(child);
	}

	public void arraylist() throws IOException {
		AnchorPane child = FXMLLoader
				.load(getClass().getResource("ArrayListPage.fxml"));
		pane.getChildren().setAll(child);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}