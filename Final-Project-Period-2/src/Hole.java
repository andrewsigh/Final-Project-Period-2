import java.awt.Color;
import javax.swing.*;
public class Hole extends JButton
{
	private int stones;
	private int loc;
	private Color color;
	
	public Hole(int l)
	{
		stones = 4;
		loc = l;
		color = Color.DARK_GRAY;
	}
	
	public int getStones()
	{
		return stones;
	}
	
	public void addStones(int num)
	{
		stones += num;
	}
	
	public void addStone()
	{
		stones++;
	}
	
	public void removeStones(int removed)
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

