 

/**
 * Interface of a cash register. 
 * @author (Seth) 
 * @version (5/27/15)
 */
public interface Register
{
    public void changePrice(int barcode, double newPrice);
    public double getTotal();
    public void addTransaction(int barcode);
    public void addItem(Item newItem);

}
