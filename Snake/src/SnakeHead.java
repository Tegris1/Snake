import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class SnakeHead extends JComponent {
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D snakeHead = new Ellipse2D.Double(0,0,20,20);
        g2.draw(snakeHead);
    }
}
