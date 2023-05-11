package _05_for_loops._1_my_ages;

public class MyAges {
	public static void main(String[] args) {
		
		/** This program will use loops to print all the ages you have been alive, 
		 * from zero up to your current age. **/

		// Make an int variable called age, to track how many times the loop has repeated
		//        Start its value at zero.
		
		// Change the value of yourCurrentAge to match your age
		int yourCurrentAge = 0;
				
		
		//  WHILE LOOP. Start a while loop to repeat while age <= yourCurrentAge
				while (yourCurrentAge <= 12){
					
				
			//  Print the age variable
		System.out.println(yourCurrentAge);
			//  Add one to the age variable
		yourCurrentAge += 1;
		//  End the while loop here
				}
		//  Run the program. Did it print all your ages from 0 to your current age?
		
		/*** Now you are going to do the same thing, but this time use a for loop. 
		 *   Notice how most of the information is the same, it is just written 
		 *   in a different way.
		 **/
		int age2 = 12;
		//  FOR LOOP. Start a for loop to repeat while age <= your age, like this:
		//  for ( age=0; age <= yourAge; age +=1 ) {
				for ( yourCurrentAge=0; yourCurrentAge <= age2; yourCurrentAge +=1 ) {
					
				
				
			//  Print the age variable
		System.out.println(yourCurrentAge);
		//  End the for loop here
				}
		//  Run the program again. 		
		//  Check that both loops printed the same numbers to the console
	}
}
