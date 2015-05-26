 

/**
 * Interface of a cash register. 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Register
{
    public void changePrice(int barcode, double newPrice);
    public double getTotal();
    public void addTransaction(int barcode);
    public void addItem(Item newItem);

}
