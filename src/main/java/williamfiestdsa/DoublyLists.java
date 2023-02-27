package williamfiestdsa;

public class DoublyLists<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public T getFront() {
        if (isEmpty()) throw new NullPointerException();
        return (T) head.data;
    }

    public T getBack() {
        if (isEmpty()) throw new NullPointerException();
        return (T) tail.data;
    }
    
    public void add(T element) {
        addBack(element);
    }

    public void addFront(T element) {
        if (isEmpty()) {
            head = tail = new Node<>(element, null, null);
        } else {
            head.prev = new Node<>(element, null, head);
            head = head.prev;
        }
        size++;
    }

    private void addBack(T element) {
        if (isEmpty()) {
            head = tail = new Node<>(element, null, null);
        } else {
            tail.next = new Node<>(element, tail, null);
            tail = tail.next;
        }
        size++;
    }

    public T removeFront() {
        if (isEmpty()) {
            throw new NullPointerException();
        }

        T data = head.data;
        head = head.next;
        --size;

        if (isEmpty()) {
            tail = null;
        }
        return data;
    }

    public T removeBack() {
        if (isEmpty()) {
            throw new NullPointerException();
        }

        T data = tail.data;
        tail = tail.prev;
        --size;

        if (isEmpty()) {
            head = null;
        }

        return data;
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

}
