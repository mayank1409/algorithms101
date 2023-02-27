package datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreesTest {

    BinarySearchTrees<String> bst;

    @BeforeEach
    void setUp() {
        bst = new BinarySearchTrees<>();
    }

    @AfterEach
    void tearDown() {
        bst = null;
    }

    @Test
    void find() {
        bst.insert("d");
        bst.insert("a");
        bst.insert("b");
        bst.insert("c");

        assertEquals("c", bst.find("c"));
    }

    @Test
    void insert() {

        bst.insert("e");
        bst.insert("a");
        bst.insert("f");
        bst.insert("c");

        assertEquals("c", bst.find("c"));
        assertEquals(null, bst.find("z"));
    }

    @Test
    void delete() {

        bst.insert("e");
        bst.insert("d");
        bst.insert("f");
        bst.insert("h");
        bst.insert("g");
        bst.insert("c");

        bst.delete("c");
        bst.delete("g");
        bst.delete("h");
        bst.delete("f");
        bst.delete("d");
        bst.delete("e");

        assertEquals(null, bst.find("d"));
        assertEquals(null, bst.find("f"));
        assertTrue(bst.isEmpty());
    }

    @Test
    void min() {
        bst.insert("c");
        bst.insert("a");
        bst.insert("d");
        bst.insert("z");
        bst.insert("g");
        bst.insert("e");

        assertEquals("a", bst.findMin());
    }

    @Test
    void max() {
        bst.insert("c");
        bst.insert("a");
        bst.insert("d");
        bst.insert("z");
        bst.insert("g");
        bst.insert("e");

        assertEquals("z", bst.findMax());
    }

    @Test
    void isEmpty() {
        bst.insert("a");
        assertFalse(bst.isEmpty());
    }

    @Test
    void inorder() {
        bst.insert("c");
        bst.insert("a");
        bst.insert("d");
        bst.insert("z");
        bst.insert("g");
        bst.insert("e");

        bst.inorder();
    }

    @Test
    void postorder() {
        bst.insert("c");
        bst.insert("a");
        bst.insert("d");
        bst.insert("z");
        bst.insert("g");
        bst.insert("e");

        bst.postOrder();
    }

    @Test
    void preorder() {
        bst.insert("c");
        bst.insert("a");
        bst.insert("d");
        bst.insert("z");
        bst.insert("g");
        bst.insert("e");

        bst.preOrder();
    }
}