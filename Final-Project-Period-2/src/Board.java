
public class Board 
{
	private PlayerBase userBase, enemyBase;
	private Holes[] holes;
	private int winNum;
	public Board()
	{
		userBase = new PlayerBase();
		enemyBase = new PlayerBase();
		winNum = 0;
		holes = new Holes[12];
		for(int loop = 0; loop < holes.size(); loop++)
		{
			holes[loop] = new Holes();
		}
	}
	
	public int winner()
	{
		winNum = userBase.checkResult(enemyBase);
		if(winNum == 1)
		{
			//graphics for "winner"
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
}
