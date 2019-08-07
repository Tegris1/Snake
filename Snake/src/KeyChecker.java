import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyChecker extends JFrame implements KeyListener {
    public KeyChecker(JFrame frame){
        frame.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e){
        int key = e.getKeyChar();
        switch (key){
            case 'w':
                System.out.println("w");
                break;
            case 's':
                System.out.println("s");
                break;
            case 'a':
                System.out.println("a");
                break;
            case 'd':
                System.out.println("d");
                break;
        }
    }
    public void keyReleased(KeyEvent e){

    }
    public void keyTyped(KeyEvent e){

    }

}


