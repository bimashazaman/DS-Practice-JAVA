public class DynamicArray {
    private int capacity;
    private int size;
    private Object[] array;

    public DynamicArray() {
        this.capacity = 10;
        this.size = 0;
        this.array = new Object[this.capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = new Object[this.capacity];
    }

    public void add(int index, Object element) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException(

                    "Index: " + index + ", Size: " + this.size);
        }

        if (this.size == this.capacity) {
            this.resize();
        }

        for (int i = this.size - 1; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }

    public void insert(int index, Object element) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException(

                    "Index: " + index + ", Size: " + this.size);

        }
    }    

    public void delete(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(

                    "Index: " + index + ", Size: " + this.size);
        }

        for (int i = index; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.size--;

    }


    public Object get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(

                    "Index: " + index + ", Size: " + this.size);
        }

        return this.array[index];

    }

    public void set(int index, Object element) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(

                    "Index: " + index + ", Size: " + this.size);
        }

        this.array[index] = element;

    }

    public void resize() {
        this.capacity *= 2;
        Object[] newArray = new Object[this.capacity];

        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;

    }

    public int size() {
        return this.size;

    }

    public int capacity() {
        return this.capacity;

    }

    public boolean isEmpty() {
        return this.size == 0;

    }

       




    }
}


