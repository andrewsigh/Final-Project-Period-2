public class PlayerBase extends Hole
{
	private int stones;
	private int loc;
	
	public PlayerBase(int l)
	{
		super(l);
		stones = 0;
		setLoc(l);
	}

	public int compareResult(PlayerBase other)
	{
		if (other.getStones() < this.getStones())
		{
			return 1;
		}
		else if (other.getStones() == this.getStones())
		{
			return 0;
		}
		else
			return -1;
	}

}