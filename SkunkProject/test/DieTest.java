import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	@Test
	public void test_initialization_of_predictable_die ()
	{
		int[] init_values =new int[] {3,2,1};
	    Die die = new Die(init_values);
	    die.roll();
	    int value= die.getLastRoll();
	    
	    assertEquals("first value not three",3,value);
	    
	  
	}
	@Test
	public void test_roll_2_of_predictable_die()
	{
		int[] init_values =new int[] {6,7,8};
	    Die die2 = new Die(init_values);
		die2.roll();
		assertEquals("Second value is not 5", 6,die2.getLastRoll());
		
		
	}
	@Test
	public void test_dice() {
		Dice dice= new Dice();
		dice.roll();
		int result = dice.getLastRoll();
		assertEquals(9, result);
		
	}

		
		
	}


