import javax.swing.JFrame;
public class PencereDeneme extends JFrame{
    public PencereDeneme() {
        setTitle("Pencere ismi");
        setBounds(600,400,300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PencereDeneme();
    }
}
