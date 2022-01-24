import java.util.Stack;


public class Main 
{
    public static void main(String[] args)
{
    Stack<String> stack = new Stack<String>();

    System.out.println("Stack is empty: " + stack.isEmpty());
    stack.push("bimasha");
    stack.push("bimasha4");
    stack.push("bimasha4");
    stack.push("bimasha46");
    stack.push("bimasha468");
    stack.push("bimasha468");
    stack.push("bimasha468");
    stack.push("bimasha468");
    stack.push("bimasha468");
    

    System.out.println("Stack is empty: " + stack.isEmpty());
    System.out.println("Stack size: " + stack.size());
    System.out.println("Stack peek: " + stack.peek());
    System.out.println("Stack pop: " + stack.pop());
    System.out.println("Stack peek: " + stack.peek());

    System.out.println("stack size: " + stack.size());
    System.out.println(stack);
}
}