public class Main {
    public static void main(String[] args) {
        
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);


        System.out.println(dynamicArray.get(0));
        System.out.println(dynamicArray.get(1));
        System.out.println(dynamicArray.get(2));

        dynamicArray.set(0, 10);
        System.out.println(dynamicArray.get(0));

        dynamicArray.remove(0);
        System.out.println(dynamicArray.get(0));

        dynamicArray.add(0, 10);

        System.out.println(dynamicArray.capacity);
    }
}