import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SnakeGame extends JFrame
{
    Container c;
    Panel p;
    SnakeGame()
    {
        setSize(500,500);
        setTitle("Snake Game");
        Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\JavaDSProject\\SnakeGAme\\images\\snake.png");
        setIconImage(icon);
        c=getContentPane();
        c.setBackground(Color.YELLOW);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new SnakeGame();
    }
}