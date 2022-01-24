import java.util.*;


public class Main 
{
    public static void main(String[] args)
{
    Queue<String> queue = new LinkedList<String>();

    queue.offer("bimasha");
    queue.offer("bimasha4");
    queue.offer("bimasha4");
    queue.offer("bimasha46");
    queue.offer("bimasha468");

    System.out.println("Queue is empty: " + queue.isEmpty());
    System.out.println(queue);
    System.out.println("Queue peek: " + queue.peek());
    System.out.println("Queue poll: " + queue.poll());

    



}
}