public class PlayerBase extends Hole 
{
	/*
	 * sets initial stone amount to 0 sets loc to index in Hole[] created in
	 * Board class
	 */
	public PlayerBase(int l) 
	{
		super(l);
		stones = 0;
		setLoc(l);
	}
 
	/*
	 * compares amount of stones in the playerBases if(the enemy playerBase has
	 * fewer stones than the user's playerBase), return 1 (equals a win) if (the
	 * enemy playerBase has the same amount of stones as the user's playerBase),
	 * return 0 (equals a tie) else return -1 (equals a loss)
	 */
	public int compareResult(PlayerBase other)
	{
		if (other.getStones() < this.getStones()) 
			return 1;
		 else if (other.getStones() == this.getStones()) 
 
			return 0;
		else
			return -1;
	}
}