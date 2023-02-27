package datastructures;

public class Queues<T> {

    private Node head;
    private Node tail;

    private static class Node<T> {
        private T data;
        private Node next;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;

        if (head == null) {
            head = tail;
        }
    }

    public T remove() {
        T data = (T) head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public T getFront() {

        if (head == null) {
            throw new NullPointerException("Queue is Empty");
        }

        return (T) head.data;
    }

    public T getLast() {
        if (tail == null) {
            throw new NullPointerException("Queue is Empty");
        }
        return (T) tail.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
