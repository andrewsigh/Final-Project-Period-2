import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent
import javax.swing.*;       // access to JFrame and Jcomponents
public class StartMenu implements ActionListener
{
	private JRadioButton onePlayer;
	private JRadioButton twoPlayer;
	private JButton startGame;
	private JButton instructions;
	private JTextArea instrArea;
	private JRadioButton easy;
	private JRadioButton hard;
	private AI computer;
	private int turn;
	
	public static void main(String[] args)
	{
		StartMenu menu = new StartMenu();
		 JFrame frame = new JFrame("Mancala");
		 menu.showFrame(frame);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Object o = event.getSource();
		 if(o.equals(onePlayer))//.isSelected())
	        {
	            //chooses 1 player mode
			 	//if(easy.isSelected())
			 	//{
			 	//	computer = new AI(false);
			 	//}
			 	//else if(hard.isSelected())
			 	//{
			 	//	computer = new AI(true);
			 	//}
	        }
	        else if(o.equals(twoPlayer))//.isSelected())
	        {
	        	//chooses 2 player mode
	        }
	        else if(o.equals(instructions))//.isSelected())
	        {
	        	instructionsDisplay();
	        }
	}
	
	public JTextArea instructionsDisplay()
	{
		JTextArea instrArea = new JTextArea("How to Play:\n" +
				"\nInitial Board Setup:" + 
				"\nThe Mancala board is made up of two rows of six holes, each hole containing four marbles." + 
				"\nEach player has a store to their right side of the Mancala board." +
				"\n\nGameplay:"+
				"\nThe game begins with the user clicking on any one of the holes on his side. +" +
				"\nThen, moving counterclockwise, one of the stones is deposited in each hole until the stones run out."+
				"\n\nIf you run into your own store, one piece will be deposited in it."+
				"\nIf you run into your opponent's store, their store will be skipped (no stone is deposited)" +
				"\n\nIf the last piece you drop is in your own store, you get another turn."+
				"\n If the last piece you drop is in an empty hole on your side, you capture that piece and any pieces" +
				"\nin the hole directly opposite, and they are moved to your own store."+
				"\n\nThe game ends when all six spaces on one side of the Mancala board are empty."+
				"\nThe player who still has pieces on his side of the board when the game ends captures all of those pieces."+
				"\nThe pieces in each store are counted, and the player with the most pieces is declared the winner.");
		instrArea.setEditable(false);
		return instrArea;
	}
	
	public void showFrame(JFrame frame1)
	{
		Container contain = frame1.getContentPane();
		contain.setLayout(new FlowLayout());
        JPanel panel1 = new JPanel();
        
        JRadioButton onePlayer = new JRadioButton("1 Player");
        JRadioButton twoPlayer = new JRadioButton("2 Player");
        JButton startGame = new JButton("Start Game!");
        JButton instructions = new JButton("How To Play Mancala");
        
        onePlayer.addActionListener(this);
        twoPlayer.addActionListener(this);
        startGame.addActionListener(this);
        instructions.addActionListener(this);
        
        ButtonGroup group = new ButtonGroup();
        group.add(onePlayer);
        group.add(twoPlayer);
        group.add(startGame);
        group.add(instructions);
        
        panel1.add(onePlayer);
        panel1.add(twoPlayer);
        panel1.add(startGame);
        panel1.add(instructions);
        
        contain.add(onePlayer);
        contain.add(twoPlayer);
        contain.add(startGame);
        contain.add(instructions);
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(300, 100);
        frame1.setVisible(true);

	}
	
	public void playerTurn()
	{
		int whoturn = (int)(Math.random() * 101);
		if(whoturn > 50)
		{
			turn = 1;
			//player 1's turn
		}
		else
		{
			turn = 2;
			//player 2 or AI's turn
		}
		//methods that decide player turn
	}
	
	public void swapTurn()
	{
		if(turn == 1)
		{
			turn = 2;
			//swaps from player 1 turn to p2/AI turn
		}
		else
		{
			turn = 1;
			//swaps from p2/AI turn to Player1 turn
		}
		//method that swaps the turn.
	}
}