import javax.swing.*;

public class Main{
    public static void main(String[] args){
        Window win = new Window();
        win.add(new Frame());

        KeyChecker checker = new KeyChecker();
        win.addKeyListener(new KeyChecker());
        if(checker.k == 'a'){
            System.out.println("a");
        }

    }
}
