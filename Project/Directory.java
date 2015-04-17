import java.util.Scanner;
 

/**
 * Write a description of class Directory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Directory
{
    /** description of instance variable x (add comment for each instance variable) */
    private int size = 1;
    private Item[] directory = new Item[size];

    /**
     * Default constructor for objects of class Directory
     */
    public Directory()
    {
        
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
    public String addItem(Item newItem)
    {
        directory[size-1] = newItem;
        size++;
        return "The " + newItem.getItemName() + " was added to the directory.";
    }

}
