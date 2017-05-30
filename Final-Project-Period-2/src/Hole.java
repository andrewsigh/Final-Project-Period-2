import java.awt.*;
import javax.swing.*;
 
public class Hole
{
	protected int stones;
	protected int loc;
	protected Color stoneColor;
 
	/*
	 * initializes stones to 4 sets loc to index in Hole[] created in Board
	 */
	public Hole(int l) 
	{
		stones = 4;
		loc = l;
		stoneColor = Color.CYAN;
	}
 
	// return stones
	public int getStones() 
	{
		return stones;
	}
 
	// add num to stones
	public void addStones(int num) 
	{
		stones += num;
	}
 
	// add 1 to stones
	public void addStone()
	{
		stones++;
	}
 
	// subtract removed from stones
	public void removeStones(int removed)
	{
		stones -= removed;
	}
 
	// return true if stones == 0
	// else, return false
	public boolean isEmpty() 
	{
		if (stones == 0)
			return true;
		return false;
	}
 
	// return loc
	public int getLoc()
	{
		return loc;
	}
 
	// set loc to location
	public void setLoc(int location)
	{
		this.loc = location;
	}
 
	// return stoneColor
	public Color getColor()
	{
		return stoneColor;
	}
 
	// set stoneColor to color
	public void setColor(Color color)
	{
		this.stoneColor = color;
	}
}
 
