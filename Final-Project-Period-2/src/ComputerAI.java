
public class ComputerAI 
{
	public int holeNumber()
	{
		int numHole = (int)(Math.random() * 7);
		return numHole;
	}
	
	public void AIMove()
	{
		//something
	}
	
	public void displayEnd()
	{
		//display something like turn end, swaps player turns
	}
	
	public void scanBoard()
	{
		//scans the board to make sure that the game can continue,
		//probably can replace this method using another method in
		//the board class.
	}
}
