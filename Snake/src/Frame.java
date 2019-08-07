import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Frame extends JComponent {


    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        for(int i =1;i<52;i++){
            Line2D s = new Line2D.Double(0,i*20,1920,i*20);
            g2.draw(s);
        }
        for(int i =1;i<110;i++){
            Line2D s = new Line2D.Double(i*20,0,i*20,1080);
            g2.draw(s);
        }


        //Ellipse2D snakeHead = new Ellipse2D.Double(0,0,20,20);
        //g2.draw(snakeHead);

    }

}