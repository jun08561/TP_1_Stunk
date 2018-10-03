import edu.princeton.cs.introcs.StdOut;

public class Die
{
	private int lastRoll;
	private boolean predictible =false;
	private int[] rolls;
	private int index_of_next_roll;


	public Die()
	{
		this.roll();
	}

	public int getLastRoll() // getter or accessor method
	{

		return this.lastRoll;
	}
    public Die(int[] predictable_rolls) {
    	this.predictible = true;
    	this.rolls = predictable_rolls;
    	this.index_of_next_roll =0;
    	
    	
          
    }
	public void roll() // note how this changes Die's state, but doesn't return anything
	{
		if (!predictible)
		{
			this.lastRoll = (int) (Math.random() * 6 + 1);
		}
		else {
			this.lastRoll = this.rolls[index_of_next_roll];
			index_of_next_roll++;
		}
		
	}
	
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}
	

}
