import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame world = new JFrame();

    public static void main(String[] args)
    {
        // Create the world.
        world.setVisible(true);
        world.setTitle("Pong: A brave new world!");
        world.setSize(480, 480);
        world.setResizable(false);

        // The land
        JPanel land = new JPanel();
        land.setBackground(Color.GREEN);

        Ball ball = new Ball();

        land.add(ball);

        world.setContentPane(land);
        world.repaint();
    }

}
