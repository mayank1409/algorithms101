package williamfiestdsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyListsTest {

    DoublyLists<String> names;

    @BeforeEach
    void setUp() {
        names = new DoublyLists<>();
    }

    @Test
    void size() {
        names.add("Mayank");
        names.add("John");
        names.add("Paul");

        assertEquals(3, names.size());
    }

    @Test
    void isEmpty() {
        assertTrue(names.isEmpty());
    }

    @Test
    void getFront() {
        names.add("Mayank");
        names.add("John");
        names.add("Paul");

        names.printList();

        assertEquals(3, names.size());
        assertEquals("Mayank", names.getFront());
    }

    @Test
    void getBack() {
        names.add("Mayank");
        names.add("John");
        names.add("Paul");

        names.printList();

        assertEquals(3, names.size());
        assertEquals("Paul", names.getBack());
    }

    @Test
    void add() {
        names.add("Mayank");
        names.add("John");
        names.add("Paul");

        names.printList();

        assertEquals(3, names.size());
    }

    @Test
    void addFront() {
        names.addFront("Shashank");
        names.addFront("Dhoni");
        names.addFront("Ravi");

        names.printList();

        assertEquals("Ravi", names.getFront());
    }

    @Test
    void removeFront() {
        names.addFront("Shashank");
        names.addFront("Dhoni");
        names.addFront("Ravi");

        names.printList();

        assertEquals("Ravi", names.removeFront());
        assertEquals("Dhoni", names.removeFront());
        assertEquals("Shashank", names.removeFront());

    }

    @Test
    void removeBack() {
        names.addFront("Shashank");
        names.addFront("Dhoni");
        names.addFront("Ravi");

        names.printList();

        assertEquals("Shashank", names.removeBack());
        assertEquals("Dhoni", names.removeBack());
        assertEquals("Ravi", names.removeBack());
    }
}