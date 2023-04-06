package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	


	String birthday = JOptionPane.showInputDialog(null, "What art thou birthday?");	
	if (birthday.equals("4/5")) {
		JOptionPane.showMessageDialog(null, "Happy birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy unbirthday!");
	}
}
}