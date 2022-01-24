import java.util.*;


public class Main 
{
    public static void main(String[] args)
{
    
Queue<Double> queue = new PriorityQueue<Double>();

queue.offer(4.0);
queue.offer(3.0);
queue.offer(8.0);
queue.offer(4.0);

while(!queue.isEmpty())
{
    System.out.println(queue.poll());
}

    
    }
}