import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.awt.image.ImageObserver;
import javax.swing.*;
 
public class BoardSpace extends GUI implements MouseListener //implements ActionListener
{
	private JMenuItem info;
	private JMenuItem returnToMain;
	private JFrame boardSpace;
	
	private int xPos;
	private int yPos;
	private int holeSelected;
	private ImageIcon boardPic;
		
	public BoardSpace()
	{
		boardSpace = new JFrame();
		Container area = boardSpace.getContentPane();
		
		// This adds the Drop Down Menu stuff
		JMenuBar dropDown = new JMenuBar();
		boardSpace.setJMenuBar(dropDown);
		JMenu Options = new JMenu("Options");
		info = new JMenuItem("Instructions");
		
		dropDown.add(Options);
		
		returnToMain = new JMenuItem("Return to Main Menu");
		
		Options.add(info);
		Options.add(returnToMain);
		
		info.addActionListener(this);
		returnToMain.addActionListener(this);
		
		// test code -- ignore
		// JCheckBoxMenuItem checkAction = new
		// JCheckBoxMenuItem("Check Action");
		// Options.add(checkAction);
		ClassLoader loader = this.getClass().getClassLoader();
		boardPic = new ImageIcon(loader.getResource("FinalBoard.png"));
		JLabel label = new JLabel(boardPic);
		label.setSize(boardPic.getIconWidth(), boardPic.getIconHeight());
		
		boardSpace.addMouseListener(this);
		
		boardSpace.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		boardSpace.setSize(boardPic.getIconWidth(),	boardPic.getIconHeight() + 55);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		boardSpace.setLocation(dim.width / 2 - boardPic.getIconWidth() / 2,dim.height / 2 - boardPic.getIconHeight() / 2);
		boardSpace.setVisible(true);
		boardSpace.setResizable(false);
		CreateTextArea();
		
		area.add(label);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Object o = event.getSource();
		if (info.equals(o)) 
		{
			showInstructions();
		}
		else if (returnToMain.equals(o)) 
		{
			boardSpace.setVisible(false);
			frame.setVisible(true);
		}
	}
	
	public void mouseClicked(MouseEvent e)
	{
		xPos = e.getX();
		yPos = e.getY();
		System.out.println(xPos + "," + yPos + "," + checkHoleClicked());
	}
	
	public void mouseEntered(MouseEvent e)
	{
	}
	public void mouseExited(MouseEvent e)
	{
	}
	public void mousePressed(MouseEvent e)
	{
	}
	public void mouseReleased(MouseEvent e)
	{
	}
	
	
	public int checkHoleClicked()
	{
		int xIncrement = 127;
		//xincrement starts at left most point of board
		//xincrement will move on to next circle on board if coords do not match
		
		if(yPos >= 260 && yPos <= 340)
		{
			for(int holeIndex = 0; holeIndex <= 5; holeIndex++)
			{
				if(xPos > xIncrement && xPos < xIncrement + 82)
				{
					holeSelected = holeIndex;
					return holeIndex;
				}
				else
				{
					xIncrement += 87;
				}
			}	
		}
		else if(yPos <= 185 && yPos >= 102)
		{
			for(int holeIndex = 12; holeIndex >= 7; holeIndex--)
			{
				if(xPos > xIncrement && xPos < xIncrement + 82)
				{
					holeSelected = holeIndex;
					return holeIndex;
				}
				else
				{
					xIncrement += 87;
				}
			}	
		}
		return -1;
	}
	
	public void CreateTextArea()
	//add parameters for the bounds of the parameter,
	//maybe set up a for loop within the constructor of boardspace in order
	//to initialize all 14 of the areas,
	//make sure to make 2 separate creattexts that create userbase and enemybase
	{
		JLabel area1 = new JLabel("1");
		boardSpace.setLayout(null);
		area1.setFont(new Font(area1.getFont().getName(), Font.PLAIN, 100));
		area1.setBounds(135, 205, 80, 80);
		//area.setbounds(x parameter, y parameter, width, height);
		//sets the center with float parameter
		area1.setAlignmentX(.5f);
		area1.setAlignmentY(.5f);
		boardSpace.getContentPane().add(area1);
	}
	/*
	protected void paintComponent(Graphics g, Image board)
	{
		Hole h = new Hole(3);
		for (int loop = 1; loop <= stones; loop++) // for(numMarbles times)
		{
			Image image = new ImageIcon(this.getClass().getResource("Blue Stone.png")).getImage();
			g.drawImage(image, board.getHeight((ImageObserver) this), board.getWidth((ImageObserver) this), null);
			// g.drawCircle beneath this line
			// g.drawImage("Blue Stone.png", 150,150, this);
		}
	}
	*/
}
 
