public class AI
{
	//6 = user storage, 13 = enemy storage
	
	public AI()
	{
		//what goes here?
		//maybe if person chooses 1 player, bring up some jButtons
	}
	
	public void takeTurn(Holes[] holes)
	{
		
			int random = (int) (Math.random() * 6);
			int stones = holes[random].getStones();
			while (stones == 0)
			{ 
				random = (int) (Math.random() * 6);
				stones = holes[random].getStones();
			}
			
			for(int loop = random + 1; loop <= holes.length; loop++)
			{
				while(stones > 0)
				{
					if (loop != 6)
					{
						holes[loop].addOneStone();
						stones--;
					}				
				}
		}
	}
}
//Computer generated player, manually plays the game in the place of another player.
//Easy mode is where the computer randomly selects 1 of the 6 cells on its side
//and moves (if the cell has any stones). 
//Continues moving until turn/game ends. 