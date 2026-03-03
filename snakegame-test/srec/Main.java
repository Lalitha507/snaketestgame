 
import javax.swing.JFrame;
 
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        Gameplay gameplay = new Gameplay();
        frame.setBounds(10, 10, 905, 700);
        frame.setBackground(java.awt.Color.DARK_GRAY);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameplay);
        frame.setVisible(true);
    }
}
    
