
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Hashtable<Integer, String> table = new Hashtable<Integer, String>(10);

        table.put(1, "one");
        table.put(2, "two");
        table.put(3, "three");
        table.put(4, "four");

        table.remove(2);


       for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " " + entry.hashCode());
        }

        System.out.println("\n");

    }

}