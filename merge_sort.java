public class Main 
{
    public static void main(String[] args) 
    {
        int[] array = {89,5,3,63,25,67,66,43,434,546,654};
        mergeSort(array);
        for(int i : array)
        {
            System.out.print(i);
        }
    }

    private static void mergeSort(int[] array)
    {
        int length = array.length;
        if(length < 2)
        {
            return;
        }

        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        int i = 0;
        int j = 0;

        for(; i < mid; i++)
        {
            if(array[i] < array[mid])
            {
                left[i] = array[i];
            }
            else
            {
                right[j] = array[i];
                j++;
            }
    }

    mergeSort(left);
    mergeSort(right);
    marge(left, right, array);
    }


    private static void marge(int[] leftArray, int[] rightArray,int[] array)
    {
       int leftSize = leftArray.length /2;
         int rightSize = rightArray.length - leftSize;

            int leftIndex = 0;
            int rightIndex = 0;
            int index = 0;

            while(leftIndex < leftSize && rightSize < rightIndex)
            {
                if(leftArray[leftIndex] < rightArray[rightIndex])
                {
                    array[index] = leftArray[leftIndex];
                    leftIndex++;
                }
                else
                {
                    array[index] = rightArray[rightIndex];
                    rightIndex++;
                }
                index++;
            }
        while(leftIndex < leftSize)
        {
            array[index] = leftArray[leftIndex];
            index++;
            leftIndex++;
        }

        while(rightIndex < rightSize)
        {
            array[index] = rightArray[rightIndex];
            index++;
            rightIndex++;
        }

    }
}