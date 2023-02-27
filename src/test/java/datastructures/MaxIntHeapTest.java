package datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxIntHeapTest {

    MaxIntHeap maxIntHeap;

    @BeforeEach
    void setUp() {
        maxIntHeap = new MaxIntHeap();
    }

    @AfterEach
    void tearDown() {
        maxIntHeap = null;
    }

    @Test
    void extractMax() {
    }

    @Test
    void insert() {
        maxIntHeap.insert(10);
        maxIntHeap.insert(20);
        maxIntHeap.insert(5);
        assertEquals(20, maxIntHeap.extractMax());
        maxIntHeap.print();
    }
}