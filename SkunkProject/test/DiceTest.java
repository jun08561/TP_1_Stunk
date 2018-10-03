import static org.junit.Assert.assertEquals;

import org.junit.After;

public class DiceTest
{

	public void setUp() throws Exception
	{
		
	}

	@After
	public void tearDown() throws Exception
	{
		
	}
	public void test_dice() {
		
        Dice dice = new Dice();
		
		dice.roll();
		int valid = dice.getLastRoll();
		
		
		assertEquals("The result of the dice is:", 10);
		
		

			
		
	}
}
