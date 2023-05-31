import javax.swing.JFrame;

public class Pencere {
    public static void main(String[] args) {
            JFrame pencere = new JFrame();
            pencere.setTitle("Penceresi İsmi");
            pencere.setSize(300,200);
            pencere.setLocation(600,400);
            pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pencere.setVisible(true);
    }
}
