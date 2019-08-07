import javax.swing.*;

public class Main{
    public static void main(String[] args){
        Window win = new Window();
        win.add(new Frame());

        KeyChecker cheker = new KeyChecker(win);

    }
}
