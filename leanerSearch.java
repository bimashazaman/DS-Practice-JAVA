import java.util.*;


public class Main 
{
    public static void main(String[] args)
{
 int[] array = {3,4,5,5,6,4,3,5,6,7,4,34};

int index = LeanerSearch(array, 1);

if(index != -1)
{
    System.out.println("Found at index: " + index);

}
else
{
    System.out.println("Not found");

}

    }

    public static int LeanerSearch(int[] array, int value)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == value)
            {
                return i;
            }
        }

        return -1;
    }
    }