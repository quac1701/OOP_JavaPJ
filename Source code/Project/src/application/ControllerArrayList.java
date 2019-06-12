package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ControllerArrayList implements Initializable {

	@FXML
	private AnchorPane pane;
	@FXML
	private TextField valueAdd;
	@FXML
	private TextField indexInsert;
	@FXML
	private TextField valueInsert;
	@FXML
	private TextField indexDelete;
	@FXML
	private Button addItem;
	@FXML
	private Button insertItem;
	@FXML
	private Button deleteItem;
	@FXML
	private Button array1, array2, array3, array4, array5, array6,
			array7, array8, array9, array10, array11, array12,
			array13, array14;
	@FXML
	private Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12,
			l13, l14;

	public ArrayList<String> list = new ArrayList<String>();

	public void indexOn(Integer num, String str) {
		final int WIDTH = 68;
		if (num == 1) {
			array1.setText(str);
			array1.setVisible(true);
			l1.setVisible(true);
			array1.setMaxWidth(WIDTH);
			array1.setMinWidth(WIDTH);

		}
		if (num == 2) {
			array2.setText(str);
			array2.setVisible(true);
			l2.setVisible(true);
			array2.setMaxWidth(WIDTH);
			array2.setMinWidth(WIDTH);
		}
		if (num == 3) {
			array3.setText(str);
			array3.setVisible(true);
			l3.setVisible(true);
			array3.setMaxWidth(WIDTH);
			array3.setMinWidth(WIDTH);
		}
		if (num == 4) {
			array4.setText(str);
			array4.setVisible(true);
			l4.setVisible(true);
			array4.setMaxWidth(WIDTH);
			array4.setMinWidth(WIDTH);
		}
		if (num == 5) {
			array5.setText(str);
			array5.setVisible(true);
			l5.setVisible(true);
			array5.setMaxWidth(WIDTH);
			array5.setMinWidth(WIDTH);
		}
		if (num == 6) {
			array6.setText(str);
			array6.setVisible(true);
			l6.setVisible(true);
			array6.setMaxWidth(WIDTH);
			array6.setMinWidth(WIDTH);
		}
		if (num == 7) {
			array7.setText(str);
			array7.setVisible(true);
			l7.setVisible(true);
			array7.setMaxWidth(WIDTH);
			array7.setMinWidth(WIDTH);
		}
		if (num == 8) {
			array8.setText(str);
			array8.setVisible(true);
			l8.setVisible(true);
			array8.setMaxWidth(WIDTH);
			array8.setMinWidth(WIDTH);
		}
		if (num == 9) {
			array9.setText(str);
			array9.setVisible(true);
			l9.setVisible(true);
			array9.setMaxWidth(WIDTH);
			array9.setMinWidth(WIDTH);
		}
		if (num == 10) {
			array10.setText(str);
			array10.setVisible(true);
			l10.setVisible(true);
			array10.setMaxWidth(WIDTH);
			array10.setMinWidth(WIDTH);
		}
		if (num == 11) {
			array11.setText(str);
			array11.setVisible(true);
			l11.setVisible(true);
			array11.setMaxWidth(WIDTH);
			array11.setMinWidth(WIDTH);
		}
		if (num == 12) {
			array12.setText(str);
			array12.setVisible(true);
			l12.setVisible(true);
			array12.setMaxWidth(WIDTH);
			array12.setMinWidth(WIDTH);
		}
		if (num == 13) {
			array13.setText(str);
			array13.setVisible(true);
			l13.setVisible(true);
			array13.setMaxWidth(WIDTH);
			array13.setMinWidth(WIDTH);
		}
		if (num == 14) {
			array14.setText(str);
			array14.setVisible(true);
			l14.setVisible(true);
			array14.setMaxWidth(WIDTH);
			array14.setMinWidth(WIDTH);
		}
	}

	public void indexOff(Integer num) {
		if (num == 1) {
			array1.setVisible(false);
			l1.setVisible(false);
		}
		if (num == 2) {
			array2.setVisible(false);
			l2.setVisible(false);
		}
		if (num == 3) {
			array3.setVisible(false);
			l3.setVisible(false);

		}
		if (num == 4) {
			array4.setVisible(false);
			l4.setVisible(false);
		}
		if (num == 5) {
			array5.setVisible(false);
			l5.setVisible(false);
		}
		if (num == 6) {
			array6.setVisible(false);
			l6.setVisible(false);
		}
		if (num == 7) {
			array7.setVisible(false);
			l7.setVisible(false);
		}
		if (num == 8) {
			array8.setVisible(false);
			l8.setVisible(false);
		}
		if (num == 9) {
			array9.setVisible(false);
			l9.setVisible(false);
		}
		if (num == 10) {
			array10.setVisible(false);
			l10.setVisible(false);
		}
		if (num == 11) {
			array11.setVisible(false);
			l11.setVisible(false);
		}
		if (num == 12) {
			array12.setVisible(false);
			l12.setVisible(false);
		}
		if (num == 13) {
			array13.setVisible(false);
			l13.setVisible(false);
		}
		if (num == 14) {
			array14.setVisible(false);
			l14.setVisible(false);
		}
	}

	public void addItem(ActionEvent event) {
		String str = valueAdd.getText();
		valueAdd.clear();
		list.add(str);
		printList();
	}

	public void insertItem(ActionEvent event) {
		String index = indexInsert.getText();
		int id = Integer.parseInt(index);
		String value = valueInsert.getText();
		if (id > list.size())
			JOptionPane.showMessageDialog(null, "Wrong index!");
		indexInsert.clear();
		valueInsert.clear();
		list.add(id, value);

		printList();
	}

	public void deleteItem(ActionEvent event) {
		String index = indexDelete.getText();
		int id = Integer.parseInt(index);
		if (id > list.size() - 1)
			JOptionPane.showMessageDialog(null, "Wrong index!");
		indexDelete.clear();
		list.remove(id);
		for (int i = 1; i <= 14; i++)
			indexOff(i);
		printList();
	}

	public void back() throws IOException {
		AnchorPane child = FXMLLoader
				.load(getClass().getResource("HomePage.fxml"));
		pane.getChildren().setAll(child);
	}

	public void printList() {
		Iterator<String> itr = list.iterator();
		int k = 0;
		while (itr.hasNext()) {
			k++;
			indexOn(k, itr.next());
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}