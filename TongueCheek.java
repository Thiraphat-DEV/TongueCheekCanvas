import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class canvas extends JPanel {
  public void paint(Graphics g)  {
    super.paint(g);
                   
    // backgroundColor of face
    g.setColor(Color.pink);
    g.fillOval(10 , 10 , 200, 200);
    
    //eyesbrow
    g.setColor(Color.magenta);
    g.fillOval(40, 40, 60, 20);
    g.setColor(Color.cyan);
    g.fillOval(115, 40, 60, 20);
    
    //eyes
    g.setColor(Color.white);
    g.fillOval(55, 65, 30, 30);
    g.fillOval(135, 65, 30, 30);
    
    //Nose
    g.setColor(Color.black);
    g.fillOval(70, 100, 80, 100);
    
    //set color rounded of mouth
    g.fillOval(50, 110, 120, 60);
    g.setColor(Color.pink);
    
    // mouth
    g.fillRect(50, 110, 120, 30);
    g.fillOval(50, 120, 120, 40);
    
  }
  public static void main(String args[]) {
    canvas ovalPerson = new canvas();
    JFrame fr = new JFrame("Bussiness");
    fr.add(ovalPerson);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.setVisible(true);
    fr.setSize(300, 300);  
  }
  
}