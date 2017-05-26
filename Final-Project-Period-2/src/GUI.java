import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//might be helpful at some point: (lots of tutorials and images)
//http://www.java2s.com/Tutorial/Java/0260__Swing-Event/Catalog0260__Swing-Event.htm
 
public class GUI implements ActionListener
{
	protected JRadioButton onePlayer;
	private JRadioButton twoPlayer;
	private JButton startGame;
	private JButton instructions;
	private JTextArea instrArea;
	private int turn;
	protected static JFrame frame;
 
	public static void main(String[] args)
	{
		GUI menu = new GUI();
		frame = new JFrame("Mancala");
		menu.showInitFrame(frame);
	}
 
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent event) // needs to be finished
	{
		Object o = event.getSource();
		if (o.equals(instructions)) 
			showInstructions();
		
		else if (startGame.equals(o))
		{
			frame.setVisible(false);
			BoardSpace myBoard = new BoardSpace();
			
			if (onePlayer.equals(o)) 
			{
				//AI comp = new AI();
			}
			else if (twoPlayer.equals(o)) 
			{
				
			}
		} 
	}
 
	/*
	 * returns JTextArea with Mancala Game Instructions sets the JTextArea to
	 * uneditable
	 */
	public JTextArea instructionsDisplay() 
	{
		JTextArea instrArea = new JTextArea(
				"\tHow to Play:\n"
						+ "\n\tInitial Board Setup:"
						+ "\nThe Mancala board is made up of two rows of six holes, each hole containing four marbles."
						+ "\nEach player has a store to their right side of the Mancala board."
						+ "\n\n\tGameplay:"
						+ "\nThe game begins with the user clicking on any one of the holes on his side. +"
						+ "\nThen, moving counterclockwise, one of the stones is deposited in each hole until the stones run out."
						+ "\n\nIf you run into your own store, one piece will be deposited in it."
						+ "\nIf you run into your opponent's store, their store will be skipped (no stone is deposited)"
						+ "\n\nIf the last piece you drop is in your own store, you get another turn."
						+ "\n If the last piece you drop is in an empty hole on your side, you capture that piece and any pieces"
						+ "\nin the hole directly opposite, and they are moved to your own store."
						+ "\n\nThe game ends when all six spaces on one side of the Mancala board are empty."
						+ "\nThe player who still has pieces on his side of the board when the game ends captures all of those pieces."
						+ "\nThe pieces in each store are counted, and the player with the most pieces is declared the winner."
						+ "\n\n\tCredits:" + "\nCoded by:"
						+ "\n Rebecca Posner and Andrew Sigh"
						+ "\n\nHelpful Resources:" + "\n Stackoverflow.com"
						+ "\n Java2s.com" + "\n Java-swing-tips.blogspot.com"
						+ "\n FlamingText.com");
		instrArea.setEditable(false);
		return instrArea;
	}
 
	/*
	 * help from:
	 * http://stackoverflow.com/questions/2442599/how-to-set-jframe-to
	 * -appear-centered-regardless-of-monitor-resolution
	 * 
	 * shows initial frame (start menu) with button to instructions and button
	 * to start game user can select either one-player mode, which creates an
	 * AI, or two-player mode
	 */
	public void showInitFrame(JFrame frame1) 
	{
		Container contain = frame1.getContentPane();
		contain.setLayout(new FlowLayout());
		JPanel panel1 = new JPanel();
		
		onePlayer = new JRadioButton("1 Player");
		twoPlayer = new JRadioButton("2 Player");
		startGame = new JButton("Start Game!");
		instructions = new JButton("How To Play Mancala");
		
		onePlayer.setSelected(true);
		
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
		
		ClassLoader clder = this.getClass().getClassLoader();
		ImageIcon picture = new ImageIcon(clder.getResource("Mancala.png"));
		JLabel pictureLabel = new JLabel(picture);
		
		contain.add(pictureLabel);
		contain.add(onePlayer);
		contain.add(twoPlayer);
		contain.add(startGame);
		contain.add(instructions);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 250);
		frame.setResizable(false);
		frame.setLocation(dim.width / 2 - 300, dim.height / 2 - 125);
		frame.setVisible(true);
	}
 
	/*
	 * decides player turn if turn = 1, player 1's turn if turn = 2, player 2 or
	 * AI's turn
	 */
	public void playerTurn() {
		int whoturn = (int) (Math.random() * 11);
		if (whoturn > 5) {
			turn = 1;
		} else {
			turn = 2;
		}
	}
 
	/*
	 * swaps the turn if turn == 1, change turn to 2 (changes from p1's turn to
	 * p2/AI's turn else, change turn to 1 (changes from p2/AI's turn to p1)
	 */
	public void swapTurn() 
	{
		if (turn == 1)
			turn = 2;
		else 
			turn = 1;
	}
 
	//displays Instructions in separate window
	public void showInstructions() 
	{
		JFrame f = new JFrame();
		Container c = f.getContentPane();
		
		instrArea = instructionsDisplay();
		c.add(instrArea);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(585, 510);
		f.setResizable(false);
		f.setLocation(dim.width / 2 - 292, dim.height / 2 - 255);
		f.setVisible(true);
	}
}