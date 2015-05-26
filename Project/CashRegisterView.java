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
    private JLabel label;
    
    private JLabel label2;
    private JLabel label3;
    
    private JFrame frame = new JFrame();
    
    private CashRegisterModel model;
    
    public CashRegisterView()
    {
       model = new CashRegisterModel();
        
        
        JPanel panel = new JPanel();
        label = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        
        
        
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
        
        panel.add(label);
        panel.add(label2);
        panel.add(label3);
        
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
                boolean done = false;
                double totalCost = model.getTotal();
                label.setText("");
                label2.setText("");
                label3.setText("$" + totalCost);
                frame.repaint();
                    
                while(done == false)
                {
                    String itemBarcode = (String)JOptionPane.showInputDialog(frame,"Enter the next four digit Barcode(Enter 0 when done): ","Checkout",JOptionPane.PLAIN_MESSAGE);
                    if( itemBarcode.equals("0"))
                    {
                        break;
                    }
                    int itemBarcodeNum = Integer.valueOf(itemBarcode);
                    
                    model.addTransaction(itemBarcodeNum);
                    
                    totalCost = model.getTotal();
                    String itemName = model.getItemName(itemBarcodeNum);
                    
                    label.setText(itemBarcode);
                    label2.setText(itemName);
                    label3.setText("$" + totalCost);
                    frame.repaint();
                    
                    
                }
            }
            else if(event.getSource() == b2)
            {
                String barcode = (String)JOptionPane.showInputDialog(frame,"Enter the four digit item barcode:\n","Add Item",JOptionPane.PLAIN_MESSAGE);
                String name = (String)JOptionPane.showInputDialog(frame,"Enter the Item Name:\n","Add Item",JOptionPane.PLAIN_MESSAGE);
                String price = (String)JOptionPane.showInputDialog(frame,"Enter the item price ($):\n","Add Item",JOptionPane.PLAIN_MESSAGE);
                
                int barcodeNum = Integer.valueOf(barcode);
                double priceNum = Double.valueOf(price);
                
                Item newItem = new Item(barcodeNum, name, priceNum);
                
                model.addItem(newItem);
                
                
                label.setText("The Item " + name + " was added with Barcode: " + barcode + " and Price: $ " + price);
                frame.repaint();
            }
            else
            {
                 String newBarcode = (String)JOptionPane.showInputDialog(frame,"Enter the Barcode of the Item for which you want to change the price:\n","Change Price",JOptionPane.PLAIN_MESSAGE);
                 String newPrice = (String)JOptionPane.showInputDialog(frame,"Enter the new item price ($):\n","Change Price",JOptionPane.PLAIN_MESSAGE);
                 
                 int newBarcodeNum = Integer.valueOf(newBarcode);
                 double newPriceNum = Double.valueOf(newPrice);
                 
                 model.changePrice(newBarcodeNum,newPriceNum);
                 
                 label.setText("The Item " + model.getItemName(newBarcodeNum) + " with barcode " + newBarcode + " has new Price: $ " + newPrice);
                 frame.repaint();
            }
            
            
        }
        
    }
    
    
}
