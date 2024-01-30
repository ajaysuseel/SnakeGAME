import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SnakeGame extends JFrame
{
    Container c;
    Panel p;
    JButton snake;
    int XLocation=0,YLocation=0;

    SnakeGame()
    {
        setSize(500,500);
        setTitle("Snake Game");
        
        //Setting up background
        Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\JavaDSProject\\SnakeGAme\\images\\snake.png");
        setIconImage(icon);
        c=getContentPane();
        c.setBackground(Color.YELLOW);

        //Snake object 
        snake=new JButton("");
        snake.setBackground(Color.RED);
        add(snake);
        snake.setBounds(0,0,25,10);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);//for flexible positioning
        /*while(true)
        {
            snake.setLocation(XLocation,YLocation);
            XLocation++;
            //YLocation++;
            if(XLocation==499)
                break;
        }*/
        setVisible(true);

        //Motion
        Timer motion=new Timer(100,new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                move(ae);
            }
        });//Timer thread used to implement the move function every 100 milliseconds
        motion.start();
        
    }

    public void move(ActionEvent ae)
    {
   
        XLocation+=5;
        //YLocation+=3;
        snake.setLocation(XLocation,YLocation);
        if(XLocation>=465)
        {
            ((Timer)ae.getSource()).stop(); //Boundary collision
        }
            
    }
    public static void main(String[] args)
    {
        new SnakeGame();
        
    }
}