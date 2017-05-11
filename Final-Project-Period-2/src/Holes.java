
public class Holes
{
	private int count;
	public Holes()
	{
		count = 4;
	}
	
	public int getStones()
	{
		return count;
	}
	
	public void addStone()
	{
		count++;
	}
	
	public void removeStone()
	{
		count--;
	}
	
	public boolean isEmpty()
	{
		if(count == 0)
			return true;
		return false;

	}
}
