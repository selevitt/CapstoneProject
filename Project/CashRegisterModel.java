

/**
 * Write a description of class CashRegisterModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CashRegisterModel implements Register
{
    private Directory directory = new Directory();
    private Transaction transaction = new Transaction();
    private double total;

    
    public CashRegisterModel()
    {
        // initialise instance variables
        
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
    
    
    
     public void addTransaction(double itemCost)
    {
        total += itemCost;
    }
    
    public double getTotal()
    {
        return transaction.getTotal();
    }
   
    
    public void changePrice(int barcode, double newPrice)
    {
        directory.getItem(barcode).changePrice(newPrice);
        
    }
    
    
}
