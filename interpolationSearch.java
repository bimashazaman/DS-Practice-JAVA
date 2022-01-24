import java.util.*;


class Main
{
    public static void Main(Strings args[])
    {
      int[] array = {1,2,3,4,5,6,7,8,9,10};
        int index = interpolationSearch(array, 5);  

        if(index != -1)
        {
            System.out.println("Found at index: " + index);
        }
        else
        {
            System.out.println("Not found");
        }
    }

    public static int interpolationSearch(int[] array, int value)
    {
        int low = 0;
        int high = array.length - 1;
       
       while(value >= array[low] && value <= array[high] && low <= high)
       {
           int prov = low + ((value - array[low]) * (high - low)) 
                     / (array[high] - array[low]);

              if(array[prov] == value)
              {
                return prov;
              }
              else if(array[prov] < value)
              {
                low = prov + 1;
              }
              else
              {
                high = prov - 1;
              }

       }

       return -1;
    }
}
