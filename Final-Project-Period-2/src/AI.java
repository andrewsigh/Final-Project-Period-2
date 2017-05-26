public class AI 
{
	// 6 = user storage, 13 = enemy storage
	public AI() 
	{
		// what goes here?
		// maybe if person chooses 1 player, bring up some jButtons
	}
 
	/*
	 * AI takeTurn randomly selects a hole with stones on its side then moves
	 * stones accordingly if hole has stones
	 */
	public void takeTurn(Hole[] holes) 
	{
		int random = (int) (Math.random() * 6);
		int stones = holes[random].getStones();
		while (stones == 0) 
		{
			random = (int) (Math.random() * 6);
			stones = holes[random].getStones();
		}
		for (int loop = random + 1; loop <= holes.length; loop++) 
		{
			while (stones > 0) 
			{
				if (loop != 6) 
				{
					holes[loop].addStone();
					stones--;
				}
			}
		}
	}
}
