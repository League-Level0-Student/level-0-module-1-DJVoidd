package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Dean = "Commonly known as the coolest person alive";
String Dylan= "He is a chillin vilian";
String June= "He is a moon beam";
String mok= "*Cute*";
String Jessica= "Best mother on the planet";
String Adam= "Best father on the planet";
String Priscilla= "She always gets her name spelt wrong";
String wutName = JOptionPane.showInputDialog("Put the name of someone in out familly and I will say a fact about them.");
if (wutName.equals("Dean")){
	JOptionPane.showInputDialog(null, Dean);
}
else if (wutName.equals("Dylan")) {
	JOptionPane.showInputDialog(null, Dylan);
}
else if (wutName.equals("June")) {
	JOptionPane.showInputDialog(null, June);
}
else if (wutName.equals("Mok")) {
	JOptionPane.showInputDialog(null, mok);
}
else if (wutName.equals("Jessica")) {
	JOptionPane.showInputDialog(null, Jessica);
}
else if (wutName.equals("Adam")) {
	JOptionPane.showInputDialog(null, Adam);
}
else if (wutName.equals("Priscilla")) {
	JOptionPane.showInputDialog(null, Priscilla);
}
else {
	JOptionPane.showInputDialog(null, "Oops! That person was not on this list. Sorry!");
}










		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

