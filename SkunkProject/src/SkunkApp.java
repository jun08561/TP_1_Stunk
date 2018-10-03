

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class SkunkApp
{

	
	public static void main(String[] args)
	{
		
		StdOut.println("Welcome to  635 Skunk!");
		
		Dice dice = new Dice();
		StdOut.println("Please enter how many time you want to play:");
		int n = StdIn.readInt(); 
		
		
		for (int i=0;i<=n;i++) {
			dice.roll();
			//dice1.roll();
			//dice2.roll();
			
			int valid = dice.getLastRoll();
		
			StdOut.println(dice.toString());

			
		} 
		
		int[] init_values =new int[] {3,2,1};
	    Die die = new Die(init_values);
	    die.roll();
	    int value= die.getLastRoll();
	    StdOut.println(die.toString());
		
	    
	    
		
	
		
		
	}
	

}
