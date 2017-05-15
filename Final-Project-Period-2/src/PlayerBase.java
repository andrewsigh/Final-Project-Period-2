public class PlayerBase extends Holes
{
	private int numStones;
	private int pLoc;
	
	public PlayerBase(int l)
	{
		super(l);
		numStones = 0;
		setpLoc(l);
	}

	public int getNumStones() 
	{
		return numStones;
	}

	public void setNumStones(int numStones) 
	{
		this.numStones = numStones;
	}
	
	public void addStonesPerm(int added)
	{
		numStones += added;
	}
	
	public int checkResult(PlayerBase other)
	{
		if (other.getNumStones() < this.getNumStones())
		{
			return 1;
		}
		else if (other.getNumStones() == this.getNumStones())
		{
			return 0;
		}
		else
			return -1;
	}

	public int getpLoc() {
		return pLoc;
	}

	public void setpLoc(int pLoc) {
		this.pLoc = pLoc;
	}
}