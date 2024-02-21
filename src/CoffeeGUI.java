import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Hashtable;
//import java.awt.Color;
import java.awt.event.ActionEvent;


public class CoffeeGUI 
{
   
    public static void main(String[] args) {
       new CoffeeGUI();
    }

    public  CoffeeGUI() 
    {

        JLabel coffeeAnswer = new JLabel();
        coffeeAnswer.setSize(80,20);

        JButton coffeeButton = new JButton("Click around, find out!");
        coffeeButton.setVisible(true);
        coffeeButton.addActionListener
    ( new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                String currentAnswer, previousAnswer = "empty";
                currentAnswer = getCoffeeStatus();
                
                if(currentAnswer != previousAnswer)
                {
                    coffeeAnswer.setText(currentAnswer);
                    coffeeAnswer.setVisible(true);
                    coffeeAnswer.revalidate();
                    previousAnswer = currentAnswer;
                }
                else
                {
                    currentAnswer = getCoffeeStatus();
                    previousAnswer = currentAnswer;
                    coffeeAnswer.setText(currentAnswer);
                    coffeeAnswer.revalidate();
                }
          }
            
        }
    );

        JPanel coffeePanelButton = new JPanel();
        coffeePanelButton.setBounds(0,0,200,50);
        //coffeePanelButton.setBackground(Color.GREEN);
        coffeePanelButton.setVisible(true);
        coffeePanelButton.add(coffeeButton);


        JPanel coffeePanelTextOut = new JPanel();
        coffeePanelTextOut.setBounds(0,55,400,100);
        coffeePanelTextOut.setVisible(true);
        //coffeePanelTextOut.setBackground(Color.BLUE);
        coffeePanelTextOut.add(coffeeAnswer);
        
        JFrame coffeeFrame = new JFrame();
        coffeeFrame.setSize(450,205);
        coffeeFrame.setTitle("Is it time?");
        coffeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        coffeeFrame.setLayout(null);
        coffeeFrame.setVisible(true);
        coffeeFrame.add(coffeePanelButton);
        coffeeFrame.add(coffeePanelTextOut);
    
    }

    private String getCoffeeStatus ()
    {

        Hashtable<Integer, String> coffeeHashTable = new Hashtable<Integer,String>();
        coffeeHashTable.put(1, "Absolutely, go get that joe!");
        coffeeHashTable.put(2,"Well... how many is this now?");
        coffeeHashTable.put(3,"I think it's time.");
        coffeeHashTable.put(4,"How about....no");
        coffeeHashTable.put(5,"Get that coffee now!");
        coffeeHashTable.put(6,"You think I have time for this? Yes...");
        coffeeHashTable.put(7,"Shit yeah!");
        coffeeHashTable.put(8,"Do bears fly?");
        coffeeHashTable.put(9,"I think you have an addiction...");
        coffeeHashTable.put(10,"Go go go!");
        coffeeHashTable.put(11,"The clock on the wall says.....No.");
        coffeeHashTable.put(12,"The clock on the wall says.....Yes.");
        coffeeHashTable.put(13,"Okay but have a seat... we need to talk about your addiction.");
        coffeeHashTable.put(14,"When did you have water?");
        coffeeHashTable.put(15,"Jesus... Fine.");
        coffeeHashTable.put(16, "Do you think I sit and wait all day for you to press this thing?");
        coffeeHashTable.put(17,"It's probably the 5th cup... go for it");
        coffeeHashTable.put(18,"How about we add some sugar to this one?");
        coffeeHashTable.put(19, "Oh my...I do believe so");
        coffeeHashTable.put(20,"You are not prepared.");
        coffeeHashTable.put(21, "Yes.");
        coffeeHashTable.put(22,"No.");
        coffeeHashTable.put(23,"Only if I get one. Pour it in the harddrive.");
        coffeeHashTable.put(24,"Can we sleep first?");
        coffeeHashTable.put(25,"I thought you'd never ask!");
        coffeeHashTable.put(26,"I already made a third pot.");
        coffeeHashTable.put(27,"If you have to ask me...Yes!");
        coffeeHashTable.put(28,"Once upon a time in a galaxy far...Oh wait. What did you want?");
        coffeeHashTable.put(29,"How hard is it to make this choice?");
        coffeeHashTable.put(30,"Yawn.... Yes, please.");
        
        double d = Math.floor(Math.random() * 30);
        int coffeeNum = (int)d + 1;

        return coffeeHashTable.get(coffeeNum);

        //return "test";


    }
}



