package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score.
		int scoreHolder=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String QUESTION= JOptionPane.showInputDialog("What is always infront of you, never around you or behind you?");
		
if (QUESTION.equalsIgnoreCase("The future")){
	JOptionPane.showMessageDialog(null, "Correct!!!");
	scoreHolder = scoreHolder+1;
}
	
if (QUESTION.equalsIgnoreCase("Nothing")){
	JOptionPane.showMessageDialog(null, "The Future");
	
}
		// 6. Add some more riddles
String QUESTION2= JOptionPane.showInputDialog("What has many keys but no locks?");

if (QUESTION2.equalsIgnoreCase("piano")){
	JOptionPane.showMessageDialog(null, "Correct!!!");
	scoreHolder = scoreHolder+1;
}
	
if (QUESTION2.equalsIgnoreCase("Nothing")){
	JOptionPane.showMessageDialog(null, "Piano");
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "scoreHolder");
		String QUESTION3= JOptionPane.showInputDialog("I am one thing that is separate from the rest, never the same, what am I?");

		if (QUESTION3.equalsIgnoreCase("An individual")){
			JOptionPane.showMessageDialog(null, "Correct!!!");
			scoreHolder = scoreHolder+1;
		}
			
		if (QUESTION3.equalsIgnoreCase("Nothing")){
			JOptionPane.showMessageDialog(null, "An individual");
				// 2. Make a pop up to show the score.
				JOptionPane.showMessageDialog(null, "scoreHolder");


}
}
}
}