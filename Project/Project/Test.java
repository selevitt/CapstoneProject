import java.util.Scanner;

public class Test
{
    public static void main( String[] args)
    {
        Item carrot = new Item(1011, "Carrot", .99);
        System.out.println(carrot.getID());
        System.out.println(carrot.getPrice());
        System.out.println(carrot.getItemName());
        
        carrot.changePrice(.75);
        System.out.println(carrot.getPrice());
        Directory purchase = new Directory();
        System.out.println(purchase.addItem(carrot));
    }
}