import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class rysunek extends JComponent
{
    protected void paintComponent (Graphics g)
    {/*
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D e = new Rectangle2D.Double(1,140,450,300);
        g2.setColor(Color.RED);
        g2.fillRect(1,140,450,300);
        g2.draw(e);
        g2.rotate(Math.PI/9);
        */
        Graphics2D g2 = (Graphics2D) g;

            double x =  (Math.random()+0.1)*Math.random()*500;
            double y =  (Math.random()+0.1)*Math.random()*1000;
            if(y+100>690)
                y=y/2;
            if(x+100>1360)
                x=x/2;
            Ellipse2D p = new Ellipse2D.Double((int)(x +100)*2, (int)y+100, 20, 20);
            g2.setColor(Color.RED);
            g2.fillOval((int)(x+100)*2, (int)y+100, 20, 20);
            g2.draw(p);
        System.out.println((int)x);


/*
        Line2D b = new Line2D.Double(200,200,400,200);
        Line2D c = new Line2D.Double(300,100,300,300);
        Line2D sw1 = new Line2D.Double(300,300,400,300);
        Line2D sw2 = new Line2D.Double(200,300,200,200);
        Line2D sw3 = new Line2D.Double(400,200,400,100);
        Line2D sw4 = new Line2D.Double(300,100,200,100);
       // JOptionPane.showMessageDialog(null, "Hail Hitler!","Nazi", JOptionPane.ERROR_MESSAGE);
        g2.setColor(Color.BLACK);
        g2.draw(b);
        g2.draw(c);
        g2.draw(sw1);
        g2.draw(sw2);
        g2.draw(sw3);
        g2.draw(sw4);

 */
    }
}

