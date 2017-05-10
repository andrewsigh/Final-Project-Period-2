
public class Holes 
{
	private int count;
	private boolean isEmpty;
	public Holes()
	{
		count = 4;
		isEmpty = false;
	}
	
	public int getStones()
	{
		return count;
	}
	
	public void addStone()
	{
		count++;
	}
	
	public void moveHole()
	{
		count = 0;
		isEmpty = true;
	}
}
