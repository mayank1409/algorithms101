package williamfiestdsa;

public class SinglyLists<T> {

    private Node head;

    private static class Node<T> {
        T data;
        Node next;
        public Node(T data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }

    public void addFront(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public T getFront() {
        return (T) head.data;
    }

    public boolean search(T element) {
        if (isEmpty()) throw new NullPointerException();

        if (head.data == element) {
            return true;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == element) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void addBack(T element) {
        Node<T> newNode = new Node<>(element);
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

    public T getLast() {
        if (head == null) {
            throw new NullPointerException("List is empty");
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (T) temp.data;
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

    public void delete(T element) {
        if (isEmpty()) throw new NullPointerException();

        if (head.data == element) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.data == element) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

    }
}
