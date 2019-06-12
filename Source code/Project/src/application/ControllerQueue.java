package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ControllerQueue implements Initializable {

	@FXML
	private AnchorPane pane;
	@FXML
	private TextField input;
	@FXML
	private Button enqueue;
	@FXML
	private Button dequeue;
	@FXML
	private Button deletequeue;
	@FXML
	private Button no1, no2, no3, no4, no5, no6, no7, no8, no9, no10,
			no11, no12;
	Queue q = new Queue();

	public void setText(Integer num, String str) {
		final int WIDTH = 150;
		if (num == 1) {
			no1.setText(str);
			no1.setMaxWidth(WIDTH);
			no1.setMinWidth(WIDTH);

		}
		if (num == 2) {
			no2.setText(str);
			no2.setMaxWidth(WIDTH);
			no2.setMinWidth(WIDTH);
		}
		if (num == 3) {
			no3.setText(str);
			no3.setMaxWidth(WIDTH);
			no3.setMinWidth(WIDTH);
		}
		if (num == 4) {
			no4.setText(str);
			no4.setMaxWidth(WIDTH);
			no4.setMinWidth(WIDTH);
		}
		if (num == 5) {
			no5.setText(str);
			no5.setMaxWidth(WIDTH);
			no5.setMinWidth(WIDTH);
		}
		if (num == 6) {
			no6.setText(str);
			no6.setMaxWidth(WIDTH);
			no6.setMinWidth(WIDTH);
		}
		if (num == 7) {
			no7.setText(str);
			no7.setMaxWidth(WIDTH);
			no7.setMinWidth(WIDTH);
		}
		if (num == 8) {
			no8.setText(str);
			no8.setMaxWidth(WIDTH);
			no8.setMinWidth(WIDTH);
		}
		if (num == 9) {
			no9.setText(str);
			no9.setMaxWidth(WIDTH);
			no9.setMinWidth(WIDTH);
		}
		if (num == 10) {
			no10.setText(str);
			no10.setMaxWidth(WIDTH);
			no10.setMinWidth(WIDTH);
		}
		if (num == 11) {
			no11.setText(str);
			no11.setMaxWidth(WIDTH);
			no11.setMinWidth(WIDTH);
		}
		if (num == 12) {
			no12.setText(str);
			no12.setMaxWidth(WIDTH);
			no12.setMinWidth(WIDTH);
		}
	}

	public void clearText(Integer num) {
		final int WIDTH = 150;
		if (num == 1) {
			no1.setText("");
			no1.setMaxWidth(WIDTH);
			no1.setMinWidth(WIDTH);

		}
		if (num == 2) {
			no2.setText("");
			no2.setMaxWidth(WIDTH);
			no2.setMinWidth(WIDTH);
		}
		if (num == 3) {
			no3.setText("");
			no3.setMaxWidth(WIDTH);
			no3.setMinWidth(WIDTH);
		}
		if (num == 4) {
			no4.setText("");
			no4.setMaxWidth(WIDTH);
			no4.setMinWidth(WIDTH);
		}
		if (num == 5) {
			no5.setText("");
			no5.setMaxWidth(WIDTH);
			no5.setMinWidth(WIDTH);
		}
		if (num == 6) {
			no6.setText("");
			no6.setMaxWidth(WIDTH);
			no6.setMinWidth(WIDTH);
		}
		if (num == 7) {
			no7.setText("");
			no7.setMaxWidth(WIDTH);
			no7.setMinWidth(WIDTH);
		}
		if (num == 8) {
			no8.setText("");
			no8.setMaxWidth(WIDTH);
			no8.setMinWidth(WIDTH);
		}
		if (num == 9) {
			no9.setText("");
			no9.setMaxWidth(WIDTH);
			no9.setMinWidth(WIDTH);
		}
		if (num == 10) {
			no10.setText("");
			no10.setMaxWidth(WIDTH);
			no10.setMinWidth(WIDTH);
		}
		if (num == 11) {
			no11.setText("");
			no11.setMaxWidth(WIDTH);
			no11.setMinWidth(WIDTH);
		}
		if (num == 12) {
			no12.setText("");
			no12.setMaxWidth(WIDTH);
			no12.setMinWidth(WIDTH);
		}
	}

	public void enQueue(ActionEvent event) {
		String str = input.getText();
		q.enQueue(str);
		setText(q.size(), str);
		input.clear();
	}

	public void deQueue(ActionEvent event) {
		q.deQueue();
		int dem = 1;
		clearText(dem);
		while (dem <= q.size()) {
			setText(dem, q.getValue(dem));
			clearText(dem + 1);
			dem++;
		}
	}

	public void back() throws IOException {
		AnchorPane child = FXMLLoader
				.load(getClass().getResource("HomePage.fxml"));
		pane.getChildren().setAll(child);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
}