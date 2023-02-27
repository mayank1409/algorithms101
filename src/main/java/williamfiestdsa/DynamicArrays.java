package williamfiestdsa;

import java.util.Arrays;

public class DynamicArrays<T> {

    private int capacity = 10;
    private T[] data;
    private int size;

    public DynamicArrays(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal capacity " + capacity);
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
    }

    public DynamicArrays() {
        this.data = (T[]) new Object[10];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public T get(int index) {
        if (index < 0 || index > size) throw new ArrayIndexOutOfBoundsException();
        return data[index];
    }

    public void set(int index, T element) {
        data[index] = element;
    }

    public void insert(int index, T element) {
        ensureCapacity();
        for (int j = size; j > index; j--) {
            data[j] = data[j-1];
        }
        data[index] = element;
        size++;
    }

    public void add(T element) {
        ensureCapacity();
        data[size] = element;
        size++;
    }

    public void delete(T element) {
        int index = indexOf(element);
        if (index == -1) {
            throw new RuntimeException("Element not found");
        }
        while (index < size-1) {
            data[index] = data[index + 1];
            index++;
        }
        size--;
    }

    public boolean contains(T element) {
        if (indexOf(element) == -1) {
            return false;
        }
        return true;
    }

    public int indexOf(T element) {
        for (int j = 0; j < size; j++) {
            if (data[j] == element) {
                return j;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        if(size == capacity) {
            data = Arrays.copyOf(data, data.length * 2);
            capacity = data.length*2;
        }
    }
}
