public class Board
{
//make sure to implement the methods where you gain another turn.
	//if you place your last stone into your STORAGE then 
	//you will gain another turn
	//also if you put your stone into an empty cell that is on
	//YOUR SIDE then you can take all of the stones from the 
	//opposite cell and add them to your STORAGE
	//when the game ends, one player will have no more stones on his/her side
	//the player that has stones on his/her side at the end of the game
	//pockets all of the stones that remain in his/her 6 holes
	private PlayerBase userBase, enemyBase;
	private Hole[] holes;
	private int winNum;
	
	public Board()
	{
		winNum = 0;
		holes = new Hole[14];
		for(int loop = 0; loop <= holes.length; loop++)
		{
			if(loop == 6 || loop == 13)
				holes[loop] = new PlayerBase(loop);
			else
				holes[loop] = new Hole(loop);
		}
	}
	
	public void imageForWinner()
	{
		if(winNum == 1)
		{
			//graphics for win
		}
		else if(winNum == 0)
		{
			//graphics for "tie"
		}
		else if(winNum == -1)
		{
			//graphics for "you lost"
		}
	}
	
	public void checkForWin()
	{
		int numEmpty2 = 0;
		int numEmpty1 = 0;
		//need to make it so all stones moved into storage
		for(int x = 0; x <=5; x++)
		{
			//this checks the player's cells numbered 1-6,
			//and determines if it is empty
			//if it is empty, sets winNum to value and win to true
			//else returns nothing
			if(holes[x].getStones() != 0)
			{
				return;
			}
			else 
			{
				numEmpty1++;
			}
		}
		if(numEmpty1 == 5)
		{
			winNum = userBase.compareResult(enemyBase);
			moveAllStones(enemyBase);
			//enemy player takes all stones on his/her side
			return;
		}
		
		for(int y = 7; y <= 13; y++)
		{
			//this checks the enemy's cells numbered 8-13,
			//and determines if it is empty,
			//if it is empty, sets winNum to value and win to true
			//else returns nothing
			if(holes[y].getStones() != 0)
			{
				return;
			}
			else 
			{
				numEmpty2++;
			}
		}
		if(numEmpty2 == 5)
		{
			winNum = userBase.compareResult(enemyBase);
			moveAllStones(userBase);
			//User takes all stones from his/her side and deposits into Storage
			return;
		}
	}
	
	public void moveAllStones(PlayerBase Storage)
	{
		if(Storage.equals(userBase) == true)
		{
			for(int x = 0; x <= 5; x++)
			{
				userBase.addStones(holes[x].getStones());
				holes[x].removeStones(holes[x].getStones());
			}
		}
		else
		{
			for(int y = 7; y < 13; y++)
			{
				enemyBase.addStones(holes[y].getStones());
				holes[y].removeStones(holes[y].getStones());
			}
		}
		//moves all stones to the players storage specified in parameter
		//for example if storage is the enemy base, takes all stones from 
		//cells 8-13 and deposits them into the enemy Storage.
		
	}
	
	public void getOppositeStones(int cellIndex)
	{
		if(holes[cellIndex].getStones() == 1)
		{
			if(cellIndex == 0)
			{
				userBase.addStones(holes[12].getStones());
				userBase.addStones(holes[0].getStones());
				holes[12].removeStones(holes[12].getStones());
				holes[0].removeStones(holes[0].getStones());
			}
			if(cellIndex == 1)
			{
				userBase.addStones(holes[11].getStones());
				userBase.addStones(holes[1].getStones());
				holes[11].removeStones(holes[11].getStones());
				holes[1].removeStones(holes[1].getStones());
			}
			if(cellIndex == 2)
			{
				userBase.addStones(holes[10].getStones());
				userBase.addStones(holes[2].getStones());
				holes[10].removeStones(holes[10].getStones());
				holes[2].removeStones(holes[2].getStones());
			}
			if(cellIndex == 3)
			{
				userBase.addStones(holes[9].getStones());
				userBase.addStones(holes[3].getStones());
				holes[9].removeStones(holes[9].getStones());
				holes[3].removeStones(holes[3].getStones());
			}
			if(cellIndex == 4)
			{
				userBase.addStones(holes[8].getStones());
				userBase.addStones(holes[4].getStones());
				holes[8].removeStones(holes[8].getStones());
				holes[4].removeStones(holes[4].getStones());
			}
			if(cellIndex == 5)
			{
				userBase.addStones(holes[7].getStones());
				userBase.addStones(holes[5].getStones());
				holes[7].removeStones(holes[7].getStones());
				holes[5].removeStones(holes[5].getStones());
			}
			if(cellIndex == 7)
			{
				userBase.addStones(holes[5].getStones());
				userBase.addStones(holes[7].getStones());
				holes[5].removeStones(holes[5].getStones());
				holes[7].removeStones(holes[7].getStones());
			}
			if(cellIndex == 8)
			{
				userBase.addStones(holes[4].getStones());
				userBase.addStones(holes[8].getStones());
				holes[4].removeStones(holes[4].getStones());
				holes[8].removeStones(holes[8].getStones());
			}
			if(cellIndex == 9)
			{
				userBase.addStones(holes[3].getStones());
				userBase.addStones(holes[9].getStones());
				holes[3].removeStones(holes[3].getStones());
				holes[9].removeStones(holes[9].getStones());
			}
			if(cellIndex == 10)
			{
				userBase.addStones(holes[2].getStones());
				userBase.addStones(holes[10].getStones());
				holes[2].removeStones(holes[2].getStones());
				holes[10].removeStones(holes[10].getStones());
			}
			if(cellIndex == 11)
			{
				userBase.addStones(holes[1].getStones());
				userBase.addStones(holes[11].getStones());
				holes[1].removeStones(holes[1].getStones());
				holes[11].removeStones(holes[11].getStones());
			}
			if(cellIndex == 12)
			{
				userBase.addStones(holes[0].getStones());
				userBase.addStones(holes[12].getStones());
				holes[0].removeStones(holes[0].getStones());
				holes[12].removeStones(holes[12].getStones()); 
			}		
		}
		//this method checks if the last stone was placed into an empty cell.
		//if so, then it takes all the stones in the cell opposite from 
		//the empty cell and deposits them into your/enemies storage.
		//also takes the stone you dropped in the empty space and adds it
		//to your storage.
		
	}

	public boolean extraTurn(int lastHole, int turn)
	{
		int last = lastHole;
		int theTurn = turn; //checks to see if last stone was put into player/enemy Mancala
							//on the player/enemy respected turn
							//displays extra turn graphic if extra turn is true
							//if extraturn is true, grants another turn, 
							//else swaps turns like normal
		if(lastStonePut(last) == 6 && theTurn == 1)
		{
			return true; //needs another && statement inside the if statement
						 //to determine whose turn it is so that the player's
						 //storage will not be messed up
		}
		else if (lastStonePut(lastHole) == 13 && theTurn == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int lastStonePut(int holeNumber)
	{
		int lastPut = holeNumber;
		return lastPut;
		//this determines where the last stone was put in order to
		//grant extra turns or more. 
	}
	
	public void move() //player chooses cell by clicking on it
	{
		/*
		 * player clicks cell he/she wants to move
		 * player cannot click on the STORAGE
		 * moves the number of stones
		 * removes number of stones from the cell
		 * swaps player turn
		 * needs to be incorporated in MAIN in order for the game to go on
		 */
	}
	
}

