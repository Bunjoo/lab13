/**
 * 
 */
package Lab04;
import java.awt.*;
import javax.swing.*;
/**
 * @author Amanda X
 *
 */
public class NestedPanels {
    public static void main(String[] args){
        JFrame frame = new JFrame("Nested Panels");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        //First subpanel
        JPanel subPanel1 = new JPanel();
        subPanel1.setPreferredSize (new Dimension(150,100));
        subPanel1.setBackground (Color.green);
        JLabel label1 = new JLabel("One");
        subPanel1.add(label1);
        
        //Second Subpanel
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize (new Dimension(150,100));
        subPanel2.setBackground (Color.red);
        JLabel label2 = new JLabel ("Two");
        subPanel2.add (label2);
        
        //Third Subpanel
        JPanel subPanel3 = new JPanel();
        subPanel3.setPreferredSize (new Dimension(300,100));
        subPanel3.setBackground (Color.pink);
        JLabel label3 = new JLabel ("Three");
        subPanel3.add (label3);
        
        //My Subpanel
        JPanel subPanel4 = new JPanel();
        subPanel4.setPreferredSize (new Dimension(320,20));
        subPanel4.setBackground (Color.blue);
        JLabel label4 = new JLabel ("My Panels");
        subPanel4.add (label4);
        
      //Primary
        JPanel primary = new JPanel();
        primary.setPreferredSize(new Dimension(320,260));
        primary.setBackground (Color.blue);
        primary.add(subPanel4);
        primary.add(subPanel1);
        primary.add(subPanel2);
        primary.add(subPanel3);
        
        
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
        
    }

}
