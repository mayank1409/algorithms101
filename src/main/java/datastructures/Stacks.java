package datastructures;

public class Stacks<T> {

    private Node top;

    private static class Node<T> {
        private T data;
        private Node next;

        Node(T data) {
            this.data = data;
        }
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) {
            throw new NullPointerException("Stack is Empty");
        }

        T data = (T) top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (top == null) {
            throw new NullPointerException("Stack is Empty");
        }
        return (T) top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        if (top == null) {
            throw new NullPointerException("Stack is Empty");
        }

        int size = 0;
        Node temp = top;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
