
public class PlayerBase 
{
	private int numStones;
	
	public PlayerBase()
	{
		numStones = 0;
	}

	public int getNumStones() 
	{
		return numStones;
	}

	public void setNumStones(int numStones) 
	{
		this.numStones = numStones;
	}
	
	public void addStone()
	{
		numStones++;
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
	
}
//Use to count stones on BOARD: 
//Keeps track of number of stones in PlayerBase. 
//When no more stones are available on one/both side/s, 
//the PlayerBase with the higher number is returned as the winner. 
//If both sides have equal numbers, then null (or something) is returned.
