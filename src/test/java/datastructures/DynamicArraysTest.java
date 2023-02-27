package datastructures;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArraysTest {

    private DynamicArrays<String> array;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        array = new DynamicArrays<>(3);
        array.add("a");
        array.add("b");
        array.add("c");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        array = null;
    }

    @org.junit.jupiter.api.Test
    void get() {
        assertEquals("a", array.get(0));
        assertEquals("b", array.get(1));
        assertEquals("c", array.get(2));
    }

    @org.junit.jupiter.api.Test
    void set() {
        array.set(0, "d");
        assertEquals("d", array.get(0));
    }

    @org.junit.jupiter.api.Test
    void add() {
        array.add("d");
        array.add("e");

        assertEquals("d", array.get(3));
        assertEquals("e", array.get(4));
    }

    @org.junit.jupiter.api.Test
    void insert() {
        array.insert(1, "g");
        assertEquals("g", array.get(1));
    }

    @org.junit.jupiter.api.Test
    void delete() {
        array.delete(0);
        array.delete(1);
        array.delete(2);

        assertEquals(0, array.getSize());

        assertEquals(null, array.get(0));
        assertEquals(null, array.get(1));
        assertEquals(null, array.get(2));
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertEquals(false, array.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void contains() {
        String element = "c";
        assertTrue(array.contains(element));
    }

}