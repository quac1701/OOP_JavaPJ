package application;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class HashOrder extends HashFunction {

	// private Scanner scanner;
	// private String str;
	public HashOrder() {
		// TODO Auto-generated constructor stub
	}

	public void addData(Hashtable<Integer, ArrayList<String>> h,
			String str) {
		HashFunction hash = new HashFunction();
		int ping = 0;
		// ping : check if the key had or not ( 0 for no, 1 for yes )
		for (Integer key : h.keySet()) {
			if (key == hash.hashCode(str)) {
				ping = 1;
			}
		}
		// if no key, then create key, array , add
		if (ping == 0) {
			h.put(hash.hashCode(str), new ArrayList<String>());
			h.get(hash.hashCode(str)).add(str);
		}
		// if had key, then check( if the data had created or not? ) 0 for no, 1 for yes
		// if the data had created, don't add more
		// if the data hadn't created, add it
		else if (ping == 1) {
			int check = 0;
			for (Integer key : h.keySet()) {
				ArrayList<String> value1 = h.get(key);
				Iterator<String> itr = value1.iterator();
				while (itr.hasNext()) {
					if (itr.next().equals(str)) {
						JOptionPane.showMessageDialog(null,
								"data already exists!");
						check = check + 1;
					}
				}
			}
			if (check == 0)
				h.get(hash.hashCode(str)).add(str);
		}
	}

	public void removeData(Hashtable<Integer, ArrayList<String>> h,
			String str) {
		HashFunction hash = new HashFunction();
		int ping = 0;
		// ping : check if the key had or not ( 0 for no, 1 for yes )
		for (Integer key : h.keySet()) {
			if (key == hash.hashCode(str)) {
				ping = 1;
			}
		}
		// if ping = 0, can not remove
		if (ping == 0) {
			JOptionPane.showMessageDialog(null,
					"data doesn't exists!");
		}
		// if ping = 1, find the data and remove it
		else if (ping == 1) {
			Integer remove_key = 0;
			Integer size_of_key = 0;
			for (Integer key : h.keySet()) {
				ArrayList<String> value = h.get(key);
				Iterator<String> itr1 = value.iterator();
				while (itr1.hasNext()) {
					String string = itr1.next();
					if (string.equals(str)) {
						remove_key = key;
						size_of_key = value.size();
					}
				}
			}
			if (remove_key == 0) {
				JOptionPane.showMessageDialog(null,
						"data doesn't exists!");
			} else {
				if (size_of_key == 1) {
					h.remove(remove_key);
				} else {
					ArrayList<String> remove_value = h
							.get(remove_key);
					Iterator<String> remove_itr = remove_value
							.iterator();
					while (remove_itr.hasNext()) {
						String remove_str = remove_itr.next();
						if (remove_str.equals(str)) {
							remove_itr.remove();
						}
					}
				}
			}
		}
	}

	public void clearHash(Hashtable<Integer, ArrayList<String>> h) {
		h.clear();
	}

}
