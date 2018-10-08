import javax.security.auth.SubjectDomainCombiner;

public class Roll
{
	private Dice dice; //This is the field variable that create outside the method and every method can use it.
	public Roll() {
		//create random dice
		this.dice = new Dice();
		
	}
	public Dice getDice()
	{
		//have to get the  dice value
		return this.dice;
	}
	public boolean isDoubleSkunk()
	{
		// TODO Auto-generated method stub
		return (dice.getDie1().getLastRoll() ==1 && dice.getDie2().getLastRoll()==1) ;
	}
	public void setDice(Die die1, Die die2) {
		this.dice.setDie1(die1);
		this.dice.setDie2(die2);
	}

}
