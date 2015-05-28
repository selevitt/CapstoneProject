/**
 * The Item class stores information about an item. The Barocde, Name, and price. Also allows for returning these
 * things as well as changing the price.
 * 
 * @author (Seth) 
 * @version (5/27/15)
 */
public class Item
{
    /** itemCOde stores the barcode of the item */
    private int itemCode;
    /** itemName stores the name of the item */
    private String itemName;
    /** itemPrice stores the price of the item */
    private double itemPrice;

    /**
     * Takes in the barcode, name, and price of the item when creating the item
     */
    public Item(int barcode, String name, double price)
    {
        itemCode = barcode;
        itemName = name;
        itemPrice = price;
    }

    /**
     * Returns the price of the item
     *
     * @pre     price is non-negative
     * @post    returns price
     * @return    double
     */
    public double getPrice()
    {
        return itemPrice;
    }
    
    /**
     * Returns the name of the item
     *
     * @post    returns name
     * @return    String
     */
    public String getItemName()
    {
        return itemName;
    }
    
    /**
     * Returns the price of the item
     *
     * @pre     barcode is a 4 digit integer
     * @post    returns barcode
     * @return    int
     */
    public int getID()
    {
        return itemCode;
    }
    
    /**
     * Changes the price of the item by enetering the new one
     *
     * @post    price is changed to new price
     * @param   newPrice (double) the new price of the item
     * @return  the new Price (double)
     */
    public double changePrice(double newPrice)
    {
        itemPrice = newPrice;
        return itemPrice;
    }

}
