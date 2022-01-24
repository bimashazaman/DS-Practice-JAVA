
// initializing the main class
public class Main{
    // the main method
    public static void main(String[] args){
        // creating an array of integers
        int array[] = {89,5,3,63,25,67,66,43,434,546,654};
        // calling the bubble sort method
        bubbleSort(array);
//        // printing the array
        for(int i : array){
            System.out.print(i);
        }
    }

//    // the bubble sort method
    public static void bubbleSort(int array[])
    {
        // the number of passes
        for(int i = 0; i < array.length - 1; i++){
            // the number of comparisons
            for(int j = 0; j < array.length - i - 1; j++){
                // if the current element is greater than the next element
                if(array[j] < array[j + 1])
                    {
                        // swap the elements
                        int temp = array[j];
                        // the current element becomes the next element
                        array[j] = array[j+1];
                        // the next element becomes the current element
                        array[j+1] = temp;
                    }
            }
        }
    }
}