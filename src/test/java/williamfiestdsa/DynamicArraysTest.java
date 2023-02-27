package williamfiestdsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArraysTest {

    DynamicArrays<Integer> array;

    @BeforeEach
    void setUp() {
        array = new DynamicArrays<>();
    }

    @Test
    void getSize() {
        array.add(10);
        array.add(20);
        array.add(30);

        assertEquals(3, array.getSize());
    }

    @Test
    void isEmpty() {
        assertTrue(array.isEmpty());
    }

    @Test
    void get() {
        array.add(10);
        array.add(20);
        array.add(30);

        assertEquals(30, array.get(2));
    }

    @Test
    void insert() {
        array.add(10);
        array.add(20);
        array.add(30);

        array.insert(0, 5);
        assertEquals(5, array.get(0));
        assertEquals(4, array.getSize());

    }

    @Test
    void delete() {
        array.add(10);
        array.add(20);
        array.add(30);

        array.delete(30);
        array.delete(20);
        array.delete(10);

        assertEquals(0, array.getSize());
    }

    @Test
    void contains() {
        array.add(10);
        array.add(20);
        array.add(30);

        assertTrue(array.contains(20));
    }

    @Test
    void indexOf() {
        array.add(10);
        array.add(20);
        array.add(30);

        assertEquals(1, array.indexOf(20));
    }
}