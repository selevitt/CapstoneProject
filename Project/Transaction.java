

/**
 * Write a description of class Transaction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transaction 
{
    /** description of instance variable x (add comment for each instance variable) */
    private int total;

    /**
     * Default constructor for objects of class Transaction
     */
    public Transaction()
    {
        total = 0;
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
    public int getTotal()
    {
        return total;
    }
    
    public void addTransaction(int itemCost)
    {
        total += itemCost;
    }

}
