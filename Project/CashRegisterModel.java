

/**
 * Write a description of class CashRegisterModel here.
 * 
 * @author (Seth) 
 * @version (5/26/15)
 */
public class CashRegisterModel implements Register
{
    private Directory directory = new Directory();
    private double total;
    
    public CashRegisterModel()
    {
        // initialise instance variable
        total = 0.0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public String getItemName(int barcode)
    {
        return directory.getItem(barcode).getItemName();
    }
    
    
    
    public void addTransaction(int barcode)
    {
        directory.getItem(barcode).getPrice();
    }
    
    public double getTotal()
    {
        return total;
    }
   
    
    public void changePrice(int barcode, double newPrice)
    {
        directory.getItem(barcode).changePrice(newPrice);
        
    }
    
    public void addItem(Item newItem)
    {
        directory.addItem(newItem);
    }
    


    
    
}
