import java.util.*;


public class Main 
{
    public static void main(String[] args)
{

    LinkedList<String> list = new LinkedList<String>();
//using stack
    // list.push("bimasha");
    // list.push("bimasha4");
    // list.push("bimasha4");
    // list.push("bimasha46");
    // list.push("bimasha468");
    // list.push("bimasha468");


// using que
list.offer("bimasha");
list.offer("bimasha4");
list.offer("bimasha4");
list.offer("bimasha46");
list.offer("bimasha468");

list.add(4,"tisha");
list.remove("bimasha");
list.addFirst("bimasha");
list.addLast("bimasha");
list.removeFirst();
list.removeLast();



    System.out.println("LinkedList is empty: " + list.isEmpty());
    System.out.println(list);
    System.out.println("LinkedList peek: " + list.peek());
    System.out.println("LinkedList poll: " + list.poll());

            
    }
    }