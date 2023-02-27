package datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueuesTest {

    Queues<Integer> integerQueues;

    @BeforeEach
    void setUp() {
        integerQueues = new Queues<>();
    }

    @AfterEach
    void tearDown() {
        integerQueues = null;
    }

    @Test
    void add() {
        integerQueues.add(10);
        integerQueues.add(20);
        integerQueues.add(30);

        assertEquals(10, integerQueues.getFront());
        assertEquals(30, integerQueues.getLast());
        assertEquals(3, integerQueues.size());
    }

    @Test
    void remove() {
        integerQueues.add(10);
        integerQueues.add(20);
        integerQueues.add(30);

        assertEquals(10, integerQueues.remove());
        assertEquals(2, integerQueues.size());
    }

    @Test
    void getFront() {
        integerQueues.add(10);
        integerQueues.add(20);
        integerQueues.add(30);

        assertEquals(10, integerQueues.getFront());
    }

    @Test
    void getLast() {
        integerQueues.add(10);
        integerQueues.add(20);
        integerQueues.add(30);
        integerQueues.add(40);
        integerQueues.add(50);
        integerQueues.add(90);

        assertEquals(10, integerQueues.getFront());
        assertEquals(90, integerQueues.getLast());
    }

    @Test
    void isEmpty() {
        assertTrue(integerQueues.isEmpty());
    }

    @Test
    void size() {
        integerQueues.add(10);
        integerQueues.add(20);
        integerQueues.add(30);
        integerQueues.add(40);
        integerQueues.add(50);
        integerQueues.add(90);

        assertEquals(6, integerQueues.size());
        assertEquals(10, integerQueues.getFront());
        assertEquals(90, integerQueues.getLast());
    }
}