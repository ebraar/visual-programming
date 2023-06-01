import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame{
    public Window(){
        setTitle("Pencere ismi");
        setBounds(600,400,300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
    }
    public void formKeyPressed(KeyEvent e) {
        System.out.println("Basılan Tuş: " + e.getKeyChar());
    }
    public static void main(String[] args) {
        new Window();
    }
}
