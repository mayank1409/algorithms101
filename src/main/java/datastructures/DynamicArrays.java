package datastructures;

import java.util.Arrays;

public class DynamicArrays<T> {

    private int initialCapacity;
    private int size;
    private T[] data;

    public DynamicArrays(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = (T[]) new Object[initialCapacity];
    }

    public T get(int index) {
        return data[index];
    }

    public void set(int index, T element) {

        if (index > initialCapacity) {
            throw new IndexOutOfBoundsException(index + " is out of bounds");
        }

        data[index] = element;
    }

    public void add(T element) {
        if (size == initialCapacity) {
            resize();
        }
        data[size] = element;
        size++;

    }

    public void insert(int index, T element) {
        if (size == initialCapacity) {
            resize();
        }

        for (int j = size; j > index; j--) {
            data[j] = data[j-1];
        }
        data[index] = element;
        size++;
    }

    public void delete(int index) {
        for (int j = index; j < size - 1; j++) {
            data[j] = data[j+1];
        }

        if (index == size) { // index is last element
            data[index] = null;
        } else {
            data[size - 1] = null; // index not last element
        }

        size--;

    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean contains(T element) {
        for (int j = 0; j < size; j++) {
            if (data[j] == element) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (int j = 0; j < size; j++) {
            System.out.println(data[j]);
        }
    }

    public int getSize() {
        return size;
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length*2);
        initialCapacity = data.length*2;
    }
}
