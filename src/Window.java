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

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                formMouseClicked(e);
            }
        });
    }
    public void formKeyPressed(KeyEvent e) {
        System.out.println("Basilan Tuş: " + e.getKeyChar());
    }

    private void formMouseClicked(MouseEvent e) {
        System.out.println("Tiklanilan Koordinat: (" +e.getX() + "," +e.getY()+ ")");
    }

    public static void main(String[] args) {
        new Window();
    }
}
