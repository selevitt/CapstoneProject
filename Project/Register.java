 

/**
 * Interface of a cash register. 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Register
{
    public double getPrice();
    public String getItemName();
    public int getID();
    public double changePrice(int newPrice);
    public String addItem(Item newItem);
    public int getTotal();
    public void addTransaction(int itemCost);
    

}
