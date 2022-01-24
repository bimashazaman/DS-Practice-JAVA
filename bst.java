import java.util.*;

//main class
public class Main 
{
    //main method
    public static void main(String[] args)
{
// initialize array
    int array[] = new int[100];
    //our target value
    int target = 42;

//fill array with random numbers
    for(int i = 0; i < array.length; i++)
    {
        array[i] = i;

    }

//    int index = Arrays.binarySearch(array, target);

// binary search method applied to array
    int index = binarySearch(array, target);


// if index is not -1, print out the index

    if(index != -1)
    {
        System.out.println("Found at index: " + index);

    }
    else
    {
        System.out.println("Not found");

    }
  }

  // binary search method
private static int binarySearch(int[] array, int target)
{
    // set left and right indexes
    int low = 0;
    int high = array.length - 1;

    // while left index is less than right index
    while (low <= high)
    {
        // set mid index
        int mid = (low + high) / 2;
        // if target is equal to mid index
         int midVal = array[mid];
    // if target is equal to mid index
         System.out.println("mid: " + mid + " midVal: " + midVal);


// if target is graeter than mid index
        if (midVal < target)
        {
            // set left index to mid index + 1
            low = mid + 1;
        }
        //if the targer is less than mid index
        else if (midVal > target)
        {
            // set right index to mid index - 1
            high = mid - 1;
        }
        else
        {
            // return mid index
            return mid;
        }

        
    }
    // return -1 if target is not found
        return -1;
}
}