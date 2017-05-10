
public class Holes 
{
	private int stones;
	
	public Holes()
	{
		stones = 4;
	}
	
	public int getStones()
	{
		return stones;
	}
	
	public void addStone()
	{
		stones++;
	}
	
	public void removeStone()
	{
		stones--;
	}
	
	public boolean isEmpty()
	{
		if(stones == 0)
			return true;
		return false;
	}
}
