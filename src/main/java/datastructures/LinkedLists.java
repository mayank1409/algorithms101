package datastructures;

public class LinkedLists<T> {
    private Node head;

    private static class Node<T> {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFront(T data) {
        // Create new Node
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addBack(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public T getFirst() {
        return (T) head.data;
    }

    public T getLast() {
        if (head == null) {
            throw new NullPointerException("List is Empty!");
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        return (T) temp.data;
    }

    public int size() {
        if (head == null) {
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

    public void delete(T data) {

        if (head == null) {
            throw new NullPointerException("List is Empty!");
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void clear() {
        head = null;
    }
}
