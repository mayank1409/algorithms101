package datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StacksTest {

    Stacks<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new Stacks<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void push() {
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    void pop() {
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    void peek() {
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void size() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();

        assertEquals(3, stack.size());
    }
}