
// initializing class
public class Main{
    // the main method
    public static void main(string[] args)
    {
        // creating an array of integers
        int array[] = {89,5,3,63,25,67,66,43,434,546,654};
//        // calling the  sort method
        selectionSort(array);
//        // printing the array
        for(int i : array)
        {
            System.out.print(i);
        }
    }

//   // the  sort method
    private static void selectionSort(int[] array)
    {
        // the number of passes
        for(int i = 0; i < array.length - 1, i++)
        { int min = i;
            for(int j = i + 1; i < array.length ; i++)
            {
                if(array[min] > array[j])
                {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }
}