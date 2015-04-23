import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

/**
 * Write a description of class CashRegister here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CashRegister
{
    
    public static void main( String[] args)
    {
        Directory itemList = new Directory();
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        frame.add(panel);
        
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        frame.setSize(400,200);     
        
        b1.setVisible(true);
        b1.setText("Start Checkout");
        panel.add(b1);
        
        b2.setVisible(true);
        b2.setText("Add Items");
        panel.add(b2);
        
        b3.setVisible(true);
        b3.setText("Change Prices");
        panel.add(b3);
        
        frame.setVisible(true);
        private class ClickListener implements ActionListener
        {
                                                                                                               
        }
    }
    
    
}
