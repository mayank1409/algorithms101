package williamfiestdsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyListsTest {

    private SinglyLists<String> names;

    @BeforeEach
    void setUp() {
        names = new SinglyLists<>();
    }

    @Test
    void isEmpty() {
        names.addBack("Ram");
        names.addBack("Ramesh");
        names.addBack("Rakesh");

        assertFalse(names.isEmpty());
        assertEquals(3, names.size());
        assertEquals("Ram", names.getFront());
    }

    @Test
    void addFront() {
        names.addFront("Ram");
        names.addFront("Ramesh");
        names.addFront("Rakesh");

        assertEquals("Rakesh", names.getFront());
    }

    @Test
    void getFront() {
        names.addFront("Ram");
        names.addFront("Ramesh");
        names.addFront("Rakesh");

        assertEquals("Rakesh", names.getFront());
    }

    @Test
    void addBack() {
        names.addBack("Ram");
        names.addBack("Ramesh");
        names.addBack("Rakesh");

        assertFalse(names.isEmpty());
        assertEquals(3, names.size());
        assertEquals("Ram", names.getFront());
    }

    @Test
    void getLast() {
        names.addBack("Ram");
        names.addBack("Ramesh");
        names.addBack("Rakesh");

        assertEquals("Rakesh", names.getLast());
    }

    @Test
    void size() {
        names.addBack("Ram");
        names.addBack("Ramesh");
        names.addBack("Rakesh");

        assertEquals(3, names.size());
    }

    @Test
    void delete() {
        names.addBack("Ram");
        names.addBack("Ramesh");
        names.addBack("Rakesh");

        names.delete("Ram");

        assertEquals("Ramesh", names.getFront());
        assertEquals(2, names.size());
    }


    @Test
    void search() {
        names.addBack("Ram");
        names.addBack("Ramesh");
        names.addBack("Rakesh");

        assertTrue(names.search("Ram"));
    }
}