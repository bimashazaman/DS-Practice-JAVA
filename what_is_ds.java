//ds is a named location that can be used to store data. 

//e.g. a stack, queue, hash table, etc. why is this important?  what is the difference between a stack and a queue?  what is the difference between a hash table and a linked list?  what is the difference between a hash table and a binary search tree?   


//what is array?  array is a collection of elements stored at the contiguous memory locations. like char[] array; 


//what is algorithm?  algorithm is a set of rules that can be applied to a set of data. e.g. sorting, searching, etc.

//what is stack?  stack is a data structure that can be used to store data in a LIFO (last in first out) manner. push() and pop() are used to add and remove data from the stack. Lifo is last in first out. it is like a vertical tower

                // |________4______|  -> TO ADD 4 TO THE STACK USE push(4) 
                // |________4______|                    -> To remove 4 from the stack use pop()
                // |________3______|  -> TO ADD 3 TO THE STACK USE push(3)
                // |_______4_______|   
                // |_____4_________|
                // |________8______|
                // |________8______|
                // |_______4_______|
                //
                //          ||
                //          ||
                //          ||  
                //          \/
                //peek returns
                 //the top element of the stack.
                //pop returns the top element of the stack and removes it from the stack.
                //push adds an element to the top of the stack.
                //isEmpty returns true if the stack is empty.
                //size returns the number of elements in the stack.


//what is queue?  queue is a data structure that can be used to store data in a FIFO (first in first out) manner. enqueue() and dequeue() are used to add and remove data from the queue. FIFO is first in first out. it is like a horizontal tower 

                // |________4______|  -> TO ADD 4 TO THE QUEUE USE enqueue(4) 
                // |________4______|                    -> To remove 4 from the queue use dequeue()
                // |________3______|  -> TO ADD 3 TO THE QUEUE USE enqueue(3)
                // |_______4_______|   
                // |_____4_________|
                // |________8______|
                // |________8______|
                // |_______4_______|
                //
                //          ||
                //          ||
                //          ||  ++++++++++++++++++++++++++++++++++++
                //          \/
                //peek returns
                 //the top element of the queue.
                //dequeue returns the top element of the queue and removes it from the queue.
                //enqueue adds an element to the end of the queue.
                //isEmpty returns true if the queue is empty.
                //size returns the number of elements in the queue.
                //add = enqueue , offer()**************************
                //remove = dequeue, poll()******************


                //what is priority queue?  a fifo data structure that can be used to store data in a priority manner. highest priority is at the top of the queue. 

                // |________4______|  -> TO ADD 4 TO THE PRIORITY QUEUE USE offer(4)
                // |________4______|                    -> To remove 4 from the priority queue use poll()
                // |________3______|  -> TO ADD 3 TO THE PRIORITY QUEUE USE offer(3)
                // |_______4_______|
                // |_____4_________|





                //arraylist vs linkedlist
                //arraylist is a collection of elements stored at the contiguous memory locations. like char[] array;
                //linkedlist is a collection of elements stored at the non-contiguous memory locations. 

                //which is better?  arraylist is better because it is faster. but linkedlist is better because it is more flexible. time complexity is O(1) for both arraylist and linkedlist.


                //how to insert node to a linked list? 
                //add(index, element)
                //add(element)
                //addFirst(element)
                //addLast(element)

                //how to remove node from a linked list?
                //remove(index)
                //removeFirst()
                //removeLast()
                //remove(element)

                //how to get node from a linked list?
                //get(index)
                //getFirst()
                //getLast()

                //how to check if a linked list is empty?
                //isEmpty()

                //how to get size of a linked list?
                //size()

                //how to get index of a node in a linked list?
                //indexOf(element)

                //how to get last index of a node in a linked list?
                //lastIndexOf(element)

                //how to get node at a specific index in a linked list?
                //get(index)

                //how to get first node in a linked list?
                //getFirst()

                //how to get last node in a linked list?
                //getLast()
                
                //how to check if a linked list contains a node?
                //contains(element)

                //how to check if a linked list contains a node at a specific index?
                //contains(index)

                //how to check if a linked list contains a node at a specific index?
                //contains(index)

                //how to sort a linked list?
                //sort()

                //how to reverse a linked list?
                //reverse()

                //how to get sublist of a linked list?
                //subList(fromIndex, toIndex)


                // what is dynamic array? dynamic array is a collection of elements stored at the contiguous memory locations. like char[] array; 

                //why should we use dynamic array?
                //dynamic array is used when the size of the array is not known in advance.

                //how to create a dynamic array?
                //char[] array = new char[10];
                //int[] array = new int[10];
                //double[] array = new double[10];
                //String[] array = new String[10];

                //how to create a dynamic array with initial values?
                //char[] array = new char[]{'a','b','c','d','e','f','g','h','i','j'};
                //int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
                //double[] array = new double[]{1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.10};
                //String[] array = new String[]{"a","b","c","d","e","f","g","h","i","j"};

                //how to get size of a dynamic array?
                //array.length

                //how to get value at a specific index of a dynamic array?
                //array[index]

                //how to create a 2D dynamic array?
                //int[][] array = new int[10][10];

                //how to create a 2D dynamic array with initial values?
                //int[][] array = new int[10][10]
                //{ 
                //    {1,2,3,4,5,6,7,8,9,10},
                //    {1,2,3,4,5,6,7,8,9,10},
                //    {1,2,3,4,5,6,7,8,9,10},



                // how to do linearSearch? 
                // linearSearch(int[] array, int key)
                // linearSearch(char[] array, char key)
                // linearSearch(double[] array, double key)
                // linearSearch(String[] array, String key)

                // how to do binarySearch?
                // binarySearch(int[] array, int key)
                // binarySearch(char[] array, char key)
                // binarySearch(double[] array, double key)
                // binarySearch(String[] array, String key)

                // how to do bubble sort?
                // bubbleSort(int[] array)

                // how to do insertion sort?
                // insertionSort(int[] array)

                // how to do selection sort?
                // selectionSort(int[] array)

                // how to do merge sort?
                // mergeSort(int[] array)

                // how to do quick sort?
                // quickSort(int[] array)

                // how to do heap sort?
                // heapSort(int[] array)

                // how to do counting sort?
                // countingSort(int[] array)


                // how to do radix sort?
                // radixSort(int[] array)

                // how to do bucket sort?
                // bucketSort(int[] array)

                // how to do shell sort?
                // shellSort(int[] array)

                // how to do heap sort?
                // heapSort(int[] array)

                //how to interpolation search?
                // interpolationSearch(int[] array, int key)

                //how to do binary search tree?
                // binarySearchTree(int[] array)

                //what is recursion?  recursion is a method of solving a problem by calling itself.

                //how to do recursion?
                //recursion(int n)
                //recursion(int n, int m)

    











