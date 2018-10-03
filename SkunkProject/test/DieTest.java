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
	public void test_roll_2_of_predictable_die()
	{
		Die die2 = new Die(new int[] {6,5,4});
		die2.roll();
		assertEquals("Second value is not 5", 6,die2.getLastRoll());
		die2.roll();
		assertEquals("Last value is not 4", 4,die2.getLastRoll());
		
	}
	public void test_roll_3_predictable_die() {
		Die die  = new Die(new int[] {9,8,7});
		die.roll();
		die.roll();
		die.roll();
		die.roll();
		assertEquals("third value is not 2", 2, die.getLastRoll());
		
		
		
	}

}
