

import edu.princeton.cs.introcs.StdOut;


public class SkunkApp
{

	
	public static void main(String[] args)
	{
		
		StdOut.println("Welcome to  635 Skunk!");
		
		
		Dice dice = new Dice();
		
		
		
		
	
		
		dice.roll();
		//dice1.roll();
		//dice2.roll();
		
		int valid = dice.getLastRoll();
		
		
		StdOut.println(dice.toString());

	}
	

}
