package datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListsTest {

    private LinkedLists<Integer> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedLists<>();
    }

    @AfterEach
    void tearDown() {
        linkedList = null;
    }

    @Test
    void addFront() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        assertEquals(3, linkedList.getFirst());
    }

    @Test
    void addBack() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        assertEquals(3, linkedList.getLast());
    }

    @Test
    void getFirst() {
        linkedList.addFront(3);
        linkedList.addFront(2);
        linkedList.addFront(1);
        assertEquals(1, linkedList.getFirst());
    }

    @Test
    void getLast() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        assertEquals(3, linkedList.getLast());
    }

    @Test
    void size() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        assertEquals(3, linkedList.size());
    }

    @Test
    public void clear() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.clear();

        assertEquals(0, linkedList.size());
    }

    @Test
    void delete() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.delete(3);

        assertEquals(2, linkedList.size());
    }
}