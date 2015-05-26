import java.util.Scanner;
import java.util.ArrayList;
 

/**
 * Write a description of class Directory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Directory
{
    /** description of instance variable x (add comment for each instance variable) */
    private ArrayList<Item> directory = new ArrayList<Item>();
    private int size;

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
    public void addItem(Item newItem)
    {
        directory.add(newItem);
    }
    
    public Item getItem(int barcode)
    {
        for(int i = 0; i < directory.size(); i++)
        {
            if( directory.get(i).getID() == barcode)
            {
                return directory.get(i);
            }
        }
        return null;
    }
    
    public int getSize()
    {
        return size;
    }
    

}
