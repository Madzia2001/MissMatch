import javax.swing.*;
import java.awt.*;

public class MissMatch extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super .paintComponent(g);
        g.setColor(new Color(28, 18, 46));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.WHITE);
        g.setFont(new Font("SansSerif", Font.BOLD, 48));
        g.drawString("Miss Match", 60, 80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Miss Match");
        MissMatch panel = new MissMatch();
        panel.setPreferredSize(new Dimension(1024, 600));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
