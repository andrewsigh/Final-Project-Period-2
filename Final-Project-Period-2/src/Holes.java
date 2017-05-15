
public class Holes 
{
	private int stones;
	private int loc;
	
	public Holes(int l)
	{
		stones = 4;
		loc = l;
	}
	
	public int getStones()
	{
		return stones;
	}
	
	public void addStone(int num)
	{
		stones += num;
	}
	
	public void addOneStone()
	{
		stones++;
	}
	
	public void removeStone(int removed)
	{
		stones -= removed;
	}
	
	public boolean isEmpty()
	{
		if(stones == 0)
			return true;
		return false;
	}

	public int getLoc() {
		return loc;
	}

	public void setLoc(int loc) {
		this.loc = loc;
	}
}

