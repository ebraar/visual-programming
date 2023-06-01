import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame{
    JLabel etiket;
    public Window(){
        setTitle("Pencere ismi");
        setBounds(600,400,300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        etiket = new JLabel("",SwingConstants.CENTER);
        etiket.setLocation(200,200);
        add(etiket);

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

        addWindowListener(new WindowAdapter(){
            public void windowOpened(WindowEvent evt){
                formWindowOpened(evt);
            }
        });
    }
    public void formKeyPressed(KeyEvent e) {
        etiket.setText("Basılan tuş: " +e.getKeyChar());
    }

    public void formMouseClicked(MouseEvent e) {
        etiket.setText("Tiklanilan Koordinat: (" +e.getX() + "," +e.getY()+ ")");
    }

    public void formWindowOpened(WindowEvent e){
        etiket.setText("Pencere Boyutu: " +e.getWindow().getSize().width+ " " +e.getWindow().getSize().height);
    }

    public static void main(String[] args) {
        new Window();
    }
}
