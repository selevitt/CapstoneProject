import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.lang.Integer;

/**
 * Write a description of class CashRegister here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CashRegisterView
{
    private JButton b1 = new JButton();
    private JButton b2 = new JButton();
    private JButton b3 = new JButton();
    
    private JFrame frame = new JFrame();
    
    public CashRegisterView()
    {
        Directory itemList = new Directory();
        
        
        JPanel panel = new JPanel();
        
        frame.add(panel);
        

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
        
        ClickListener listener = new ClickListener();
        
        b1.addActionListener( listener );
        b2.addActionListener( listener );
        b3.addActionListener( listener );
        
    }
    
    public static void main(String[] args)
    {
        CashRegisterView register = new CashRegisterView();
        
    }
    public class ClickListener implements ActionListener
    {
        public void actionPerformed( ActionEvent event )
        {
            if(event.getSource() == b1)
            {
                String s = (String)JOptionPane.showInputDialog(
                    frame,
                    "Complete the sentence:\n"
                    + "\"Green eggs and...\"",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE);
            }
            else if(event.getSource() == b2)
            {
                String barcode = (String)JOptionPane.showInputDialog(frame,"Enter the four digit item barcode:\n","Add Item",JOptionPane.PLAIN_MESSAGE);
                String name = (String)JOptionPane.showInputDialog(frame,"Enter the Item Name:\n","Add Item",JOptionPane.PLAIN_MESSAGE);
                String price = (String)JOptionPane.showInputDialog(frame,"Enter the item price ($):\n","Add Item",JOptionPane.PLAIN_MESSAGE);
                
                int barcodeNum = Integer.getInteger(barcode);
                double priceNum = Double.valueOf(price);
            }
            else
            {
                 String newName = (String)JOptionPane.showInputDialog(frame,"Enter the Name of the Item for which you want to change the price:\n","Change Price",JOptionPane.PLAIN_MESSAGE);
                 String newPrice = (String)JOptionPane.showInputDialog(frame,"Enter the new item price ($):\n","Change Price",JOptionPane.PLAIN_MESSAGE);
                 
                 double newPriceNum = Double.valueOf(newPrice);
            }
            
            
        }
        
    }
    
    
}
