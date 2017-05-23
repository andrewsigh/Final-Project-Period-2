package finalProject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//might be helpful at some point: (lots of tutorials and images)

//http://www.java2s.com/Tutorial/Java/0260__Swing-Event/Catalog0260__Swing-Event.htm


public class StartMenu implements ActionListener 

{

    private JRadioButton onePlayer;

    private JRadioButton twoPlayer;

    private JButton startGame;

    private JButton instructions;

    private JTextArea instrArea;

    private int turn;


    public static void main(String[] args) 

    {

        StartMenu menu = new StartMenu();

        JFrame frame = new JFrame("Mancala");

        menu.showFrame(frame);

    }


    public void actionPerformed(ActionEvent event) //needs to be finished

    {

        Object o = event.getSource();

        if (o.equals(instructions)) 

        {

            JFrame f = new JFrame();

            Container c = f.getContentPane();


            instrArea = instructionsDisplay();


            c.add(instrArea);


            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

            

            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            f.setSize(585, 525);

            f.setLocation(dim.width/2 - 292, dim.height/2 - 263);

            f.setVisible(true);

        } 

        else if (startGame.equals(o)) 

        {

            if (onePlayer.equals(o)) 

            {


            } 

            else if (twoPlayer.equals(o)) 

            {


            }

        }

    }

    

    public JTextArea instructionsDisplay()

    {

        JTextArea instrArea = new JTextArea("\tHow to Play:\n" +

                "\n\tInitial Board Setup:" + 

                "\nThe Mancala board is made up of two rows of six holes, each hole containing four marbles." + 

                "\nEach player has a store to their right side of the Mancala board." +

                "\n\n\tGameplay:"+

                "\nThe game begins with the user clicking on any one of the holes on his side. +" +

                "\nThen, moving counterclockwise, one of the stones is deposited in each hole until the stones run out."+

                "\n\nIf you run into your own store, one piece will be deposited in it."+

                "\nIf you run into your opponent's store, their store will be skipped (no stone is deposited)" +

                "\n\nIf the last piece you drop is in your own store, you get another turn."+

                "\n If the last piece you drop is in an empty hole on your side, you capture that piece and any pieces" +

                "\nin the hole directly opposite, and they are moved to your own store."+

                "\n\nThe game ends when all six spaces on one side of the Mancala board are empty."+

                "\nThe player who still has pieces on his side of the board when the game ends captures all of those pieces."+

                "\nThe pieces in each store are counted, and the player with the most pieces is declared the winner." +

                "\n\n\tCredits:" +

                "\nCoded by:" +

                "\n    Rebecca Posner and Andrew Sigh" +

                "\n\nHelpful Resources:" +

                "\n    Stackoverflow.com" +

                "\n    Java2s.com" +

                "\n    Java-swing-tips.blogspot.com" +

                "\n    FlamingText.com");

        instrArea.setEditable(false);

        return instrArea;


    }


    public void showFrame(JFrame frame1) {

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


        // http://stackoverflow.com/questions/2442599/how-to-set-jframe-to-appear-centered-regardless-of-monitor-resolution

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setSize(600, 255);

        frame1.setLocation(dim.width/2 - 300, dim.height/2 - 128);

        frame1.setVisible(true);

    }


    //methods that decide player turn

    public void playerTurn() 

    {

        int whoturn = (int)(Math.random() * 101);

        if(whoturn > 50)

        {

            turn = 1; //player 1's turn

        }

        else

        {

            turn = 2; //player 2 or AI's turn

        }

    }

    

    //method that swaps the turn.

    public void swapTurn()

    {

        if(turn == 1)

        {

            turn = 2; //swaps from player 1 turn to p2/AI turn

        }

        else

        {

            turn = 1;//swaps from p2/AI turn to Player1 turn

        }

        

    }

}


