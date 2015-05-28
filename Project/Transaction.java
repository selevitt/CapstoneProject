

/**
 * Stores the total of the transaction and allows for adding a transaction
 * 
 * @author (Seth) 
 * @version (5/27/15)
 */
public class Transaction 
{
    /** Total cost of transaction */
    private double total;

    /**
     * Sets total to 0
     */
    public Transaction()
    {
        total = 0;
    }

    /**
     * Returns the total cost at that point
     *
     * @pre     total is at least 0
     * @return    double
     */
    public double getTotal()
    {
        return total;
    }
    
     /**
     * Adds more to the total based on the cost of the item
     * 
     * @pre     total is at least 0
     * @post    total will be incremented to the new total
     * @param   the cost of the new item
     */
    public void addTransaction(double itemCost)
    {
        total += itemCost;
    }
    

}
