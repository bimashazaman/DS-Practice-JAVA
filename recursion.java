public class Main
{
    public static void main(String[] args)
    {
        walk(5);
    }

    private static void walk(int steps)
    {
        for(int i = 0; i < steps; i++)
        {
            System.out.println("I am walking");
        }

        if(steps > 0)
        {
            walk(steps - 1);
        }
    }
}