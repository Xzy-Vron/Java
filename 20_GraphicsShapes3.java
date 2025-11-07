
/*
 Graphics programs require AWT/Swing GUI. Below are example programs for Indian Flag and a smiley
 Save as separate files and run in an environment that supports GUI.
*/
import javax.swing.*;
import java.awt.*;

class FlagPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth(), h = getHeight();
        int stripeH = h/3;
        g.setColor(Color saffron()); g.fillRect(0,0,w,stripeH);
        g.setColor(Color.white); g.fillRect(0,stripeH,w,stripeH);
        g.setColor(Color.green); g.fillRect(0,2*stripeH,w,stripeH);
        // Ashoka Chakra simple circle
        g.setColor(Color.blue);
        g.drawOval(w/2-30, h/2-15, 60, 60);
    }
    private Color saffron(){ return new Color(255,140,0); }
}
class SmileyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w=getWidth(), h=getHeight();
        g.setColor(Color.yellow); g.fillOval(10,10,w-20,h-20);
        g.setColor(Color.black); g.fillOval(w/4,h/4,10,10); g.fillOval(3*w/4-20,h/4,10,10);
        g.drawArc(w/4, h/2, w/2, h/4, 0, -180);
    }
}
public class GraphicsFlagEmoji {
    public static void main(String[] args){
        JFrame f = new JFrame("Flag and Smiley");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,300);
        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Flag", new FlagPanel());
        tabs.add("Smiley", new SmileyPanel());
        f.add(tabs);
        f.setVisible(true);
    }
}
