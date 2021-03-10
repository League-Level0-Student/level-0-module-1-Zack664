package _05_for_loops._1_my_ages;

import java.nio.file.FileSystemLoopException;

public class MyAges {
	public static void main(String[] args) {
		
		/** This program will use loops to print all the ages you have been alive, 
		 * from zero up to your current age. **/

		// Make an int variable called age, to track how many times the loop has repeated
		//        Start its value at zero.
		int aGE = 0;
		// Change the value of yourCurrentAge to match your age
		int yCA = 12;
				
		
		//  WHILE LOOP. Start a while loop to repeat while age <= yourCurrentAge
			while(aGE<=yCA) {
				
			
			//  Print the age variable
		System.out.println(aGE);
			//  Add one to the age variable
		aGE=aGE+1;
		//  End the while loop here
			}
		//  Run the program. Did it print all your ages from 0 to your current age?
		//yes
		/*** Now you are going to do the same thing, but this time use a for loop. 
		 *   Notice how most of the information is the same, it is just written 
		 *   in a different way.
		 **/
		
		//  FOR LOOP. Start a for loop to repeat while age <= your age, like this:
		
			//  for ( age=0; age <= yourAge; age +=1 ) {
			 for ( aGE=0; aGE <= yCA; aGE +=1 ) {
			//  Print the age variable
				 System.out.println(aGE);
		//  End the for loop here
		
		//  Run the program again. 		
		//  Check that both loops printed the same numbers to the console
			 }
			 }
}
