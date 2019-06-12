package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ControllerHashTable implements Initializable {

	@FXML
	private AnchorPane pane;
	@FXML
	private Button addToHash;

	@FXML
	private Button deleteHash;

	@FXML
	private Button removeFromHash;

	@FXML
	private TextField myTextField;
	// 20 buttons
	@FXML
	private Button button1, button2, button3, button4, button5,
			button6, button7, button8, button9, button10, button11,
			button12, button13, button14, button15, button16,
			button17, button18, button19, button20;
	@FXML
	private Label label1, label2, label3, label4, label5, myKey;
	Hashtable<Integer, ArrayList<String>> hashTable = new Hashtable<Integer, ArrayList<String>>();
	HashOrder hashOrder = new HashOrder();
	HashFunction hashFunc = new HashFunction();

	public void setButtonOn(Integer num, String str) {
		final int WIDTH = 140;
		if (num == 1) {
			myKey.setVisible(true);
			label1.setText(hashFunc.hashCode(str) + "");
			label1.setVisible(true);
			button1.setText(str);
			button1.setVisible(true);
			button1.setMaxWidth(WIDTH);
			button1.setMinWidth(WIDTH);

		}
		if (num == 2) {
			button2.setText(str);
			button2.setVisible(true);
			button2.setMaxWidth(WIDTH);
			button2.setMinWidth(WIDTH);
		}
		if (num == 3) {
			button3.setText(str);
			button3.setVisible(true);
			button3.setMaxWidth(WIDTH);
			button3.setMinWidth(WIDTH);
		}
		if (num == 4) {
			button4.setText(str);
			button4.setVisible(true);
			button4.setMaxWidth(WIDTH);
			button4.setMinWidth(WIDTH);
		}
		if (num == 5) {
			label2.setText(hashFunc.hashCode(str) + "");
			label2.setVisible(true);
			button5.setText(str);
			button5.setVisible(true);
			button5.setMaxWidth(WIDTH);
			button5.setMinWidth(WIDTH);
		}
		if (num == 6) {
			button6.setText(str);
			button6.setVisible(true);
			button6.setMaxWidth(WIDTH);
			button6.setMinWidth(WIDTH);
		}
		if (num == 7) {
			button7.setText(str);
			button7.setVisible(true);
			button7.setMaxWidth(WIDTH);
			button7.setMinWidth(WIDTH);
		}
		if (num == 8) {
			button8.setText(str);
			button8.setVisible(true);
			button8.setMaxWidth(WIDTH);
			button8.setMinWidth(WIDTH);
		}
		if (num == 9) {
			label3.setText(hashFunc.hashCode(str) + "");
			label3.setVisible(true);
			button9.setText(str);
			button9.setVisible(true);
			button9.setMaxWidth(WIDTH);
			button9.setMinWidth(WIDTH);
		}
		if (num == 10) {
			button10.setText(str);
			button10.setVisible(true);
			button10.setMaxWidth(WIDTH);
			button10.setMinWidth(WIDTH);
		}
		if (num == 11) {
			button11.setText(str);
			button11.setVisible(true);
			button11.setMaxWidth(WIDTH);
			button11.setMinWidth(WIDTH);
		}
		if (num == 12) {
			button12.setText(str);
			button12.setVisible(true);
			button12.setMaxWidth(WIDTH);
			button12.setMinWidth(WIDTH);
		}
		if (num == 13) {
			label4.setText(hashFunc.hashCode(str) + "");
			label4.setVisible(true);
			button13.setText(str);
			button13.setVisible(true);
			button13.setMaxWidth(WIDTH);
			button13.setMinWidth(WIDTH);
		}
		if (num == 14) {
			button14.setText(str);
			button14.setVisible(true);
			button14.setMaxWidth(WIDTH);
			button14.setMinWidth(WIDTH);
		}
		if (num == 15) {
			button15.setText(str);
			button15.setVisible(true);
			button15.setMaxWidth(WIDTH);
			button15.setMinWidth(WIDTH);
		}
		if (num == 16) {
			button16.setText(str);
			button16.setVisible(true);
			button16.setMaxWidth(WIDTH);
			button16.setMinWidth(WIDTH);
		}
		if (num == 17) {
			label5.setText(hashFunc.hashCode(str) + "");
			label5.setVisible(true);
			button17.setText(str);
			button17.setVisible(true);
			button17.setMaxWidth(WIDTH);
			button17.setMinWidth(WIDTH);
		}
		if (num == 18) {
			button18.setText(str);
			button18.setVisible(true);
			button18.setMaxWidth(WIDTH);
			button18.setMinWidth(WIDTH);
		}
		if (num == 19) {
			button19.setText(str);
			button19.setVisible(true);
			button19.setMaxWidth(WIDTH);
			button19.setMinWidth(WIDTH);
		}
		if (num == 20) {
			button20.setText(str);
			button20.setVisible(true);
			button20.setMaxWidth(WIDTH);
			button20.setMinWidth(WIDTH);
		}

	}

	public void setButtonOff(Integer num) {
		if (num == 1) {
			myKey.setVisible(false);
			label1.setVisible(false);
			button1.setVisible(false);
		}
		if (num == 2) {
			button2.setVisible(false);

		}
		if (num == 3) {
			button3.setVisible(false);

		}
		if (num == 4) {
			button4.setVisible(false);

		}
		if (num == 5) {
			label2.setVisible(false);
			button5.setVisible(false);

		}
		if (num == 6) {
			button6.setVisible(false);

		}
		if (num == 7) {
			button7.setVisible(false);

		}
		if (num == 8) {
			button8.setVisible(false);

		}
		if (num == 9) {
			label3.setVisible(false);
			button9.setVisible(false);

		}
		if (num == 10) {
			button10.setVisible(false);

		}
		if (num == 11) {
			button11.setVisible(false);

		}
		if (num == 12) {
			button12.setVisible(false);

		}
		if (num == 13) {
			label4.setVisible(false);
			button13.setVisible(false);

		}
		if (num == 14) {
			button14.setVisible(false);

		}
		if (num == 15) {
			button15.setVisible(false);

		}
		if (num == 16) {
			button16.setVisible(false);

		}
		if (num == 17) {
			label5.setVisible(false);
			button17.setVisible(false);

		}
		if (num == 18) {
			button18.setVisible(false);

		}
		if (num == 19) {
			button19.setVisible(false);

		}
		if (num == 20) {
			button20.setVisible(false);

		}

	}

	public void addHash(ActionEvent event) {
		String str = myTextField.getText();
		hashOrder.addData(hashTable, str);
		for (Integer x = 1; x < 21; x++) {
			setButtonOff(x);
		}
		print();
		myTextField.clear();
	}

	public void removeHash(ActionEvent event) {
		String str = myTextField.getText();
		hashOrder.removeData(hashTable, str);
		Integer x = 0;
		for (x = 1; x < 21; x++) {
			setButtonOff(x);
		}
		print();
		myTextField.clear();
	}

	public void deleteHash(ActionEvent event) {
		hashOrder.clearHash(hashTable);
		for (Integer x = 1; x < 21; x++) {
			setButtonOff(x);
		}
		print();
	}

	public void print() {
		Integer i = 0;
		for (Integer key : hashTable.keySet()) {
			i++;
			ArrayList<String> value = hashTable.get(key);
			System.out.println(key);

			Iterator<String> itr = value.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next() + ", ");
			}
			System.out.println(i);

			if (i == 1) {
				Integer k = 0;
				ArrayList<String> value1 = hashTable.get(key);
				Iterator<String> itr1 = value1.iterator();
				while (itr1.hasNext()) {
					k++;
					setButtonOn(k, itr1.next() + "");
				}
			}
			if (i == 2) {
				Integer k = 0;
				ArrayList<String> value2 = hashTable.get(key);
				Iterator<String> itr2 = value2.iterator();
				while (itr2.hasNext()) {
					k++;
					setButtonOn(k + 4, itr2.next() + "");
				}
			}
			if (i == 3) {
				Integer k = 0;
				ArrayList<String> value2 = hashTable.get(key);
				Iterator<String> itr2 = value2.iterator();
				while (itr2.hasNext()) {
					k++;
					setButtonOn(k + 8, itr2.next() + "");
				}
			}
			if (i == 4) {
				Integer k = 0;
				ArrayList<String> value2 = hashTable.get(key);
				Iterator<String> itr2 = value2.iterator();
				while (itr2.hasNext()) {
					k++;
					setButtonOn(k + 12, itr2.next() + "");
				}
			}
			if (i == 5) {
				Integer k = 0;
				ArrayList<String> value2 = hashTable.get(key);
				Iterator<String> itr2 = value2.iterator();
				while (itr2.hasNext()) {
					k++;
					setButtonOn(k + 16, itr2.next() + "");
				}
			}

		}
	}

	public void back() throws IOException {
		AnchorPane child = FXMLLoader
				.load(getClass().getResource("HomePage.fxml"));
		pane.getChildren().setAll(child);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}