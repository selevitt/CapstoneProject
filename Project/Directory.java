import java.util.Scanner;
import java.util.ArrayList;
 

/**
 * A class that stores items in an ArrayList and allows the user to access these items.
 * 
 * @author (Seth) 
 * @version (5/27/15)
 */
public class Directory
{
    /** The arraylist that stores all the items that are added */
    private ArrayList<Item> directory = new ArrayList<Item>();

    /**
     * Creates a Directory that can be accessed
     */
    public Directory()
    {
        
    }

    /**
     * Adds a new item to the Directory
     *
     * @pre     Item is correctly created
     * @post    the item is added to the directory
     * @param    newItem    the new item that needs to be added
     */
    public void addItem(Item newItem)
    {
        directory.add(newItem);
    }
    
    /**
     * returns the item that has the matching barcode
     *
     * @pre     there is an item with the matching barcode
     * @post    the item is returned with matching barcode
     * @param    int barcode the barcode of the item you are looking for.
     * @return  Item
     */
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
    

}
