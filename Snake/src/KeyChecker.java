import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyChecker extends KeyAdapter {
    public char k;

    public KeyChecker(){}
    public void keyPressed(KeyEvent event){
        char ch = event.getKeyChar();
        k = ch;

        if(ch=='w'){
            System.out.println("w");
        }
        if(event.getKeyCode()==KeyEvent.VK_HOME){
            System.out.println("Keys : "+ event.getKeyCode());
        }


    }

}


