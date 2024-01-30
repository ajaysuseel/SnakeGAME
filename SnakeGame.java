import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SnakeGame extends JFrame
{
    Container c;
    Panel p;
    static JButton snake;
    SnakeGame()
    {
        setSize(500,500);
        setTitle("Snake Game");
        
        Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\JavaDSProject\\SnakeGAme\\images\\snake.png");
        setIconImage(icon);
        c=getContentPane();
        c.setBackground(Color.YELLOW);

        snake=new JButton("");
        snake.setBackground(Color.RED);
        add(snake);
        snake.setBounds(0,0,25,10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);//for flexible positioning
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new SnakeGame();
        //snake.setLocation(0,0);
    }
}