import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent
import javax.swing.*;       // access to JFrame and Jcomponents

public class StartMenu 
{
	private JRadioButton jradbutton1;
	private JRadioButton jradbutton2;
	private JRadioButton jradbutton3;
	private JRadioButton jradbutton4;
	
	public static void main(String[] args)
	{
		StartMenu menu = new StartMenu();
		 JFrame frame = new JFrame("Mancala");
		 menu.showFrame(frame);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		 if(jradbutton1.isSelected())
	        {
	            //chooses 1 player mode
	        }
	        else if(jradbutton2.isSelected())
	        {
	        	//chooses 2 player mode
	        }
	        else if(jradbutton3.isSelected())
	        {
	            //display instructions
	        }
	        else if(jradbutton4.isSelected())
	        {
	        	//close
	        }
	}
	
	public void showFrame(JFrame frame1)
	{
		Container contain = frame1.getContentPane();
		contain.setLayout(new FlowLayout());
        JPanel panel1 = new JPanel();
        JRadioButton jradbutton1 = new JRadioButton("1 Player");
        JRadioButton jradbutton2 = new JRadioButton("2 Player");
        JRadioButton jradbutton3 = new JRadioButton("How To Play Mancala");
        JRadioButton jradbutton4 = new JRadioButton("Exit");
        ButtonGroup group = new ButtonGroup();
        group.add(jradbutton1);
        group.add(jradbutton2);
        group.add(jradbutton3);
        group.add(jradbutton4);
        panel1.add(jradbutton1);
        panel1.add(jradbutton2);
        panel1.add(jradbutton3);
        panel1.add(jradbutton4);
        contain.add(jradbutton1);
        contain.add(jradbutton2);
        contain.add(jradbutton3);
        contain.add(jradbutton4);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1000, 300);
        frame1.setVisible(true);
	}
}
