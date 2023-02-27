package datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTablesTest {

    HashTables<String, Integer> hashTable;

    @BeforeEach
    void setUp() {
        hashTable = new HashTables<>();
    }

    @AfterEach
    void tearDown() {
        hashTable = null;
    }

    @Test
    void put() {
        hashTable.put("Mayank", 14);
        hashTable.put("Madhav", 28);
        hashTable.put("Shashank", 4);

        assertEquals(14, hashTable.get("Mayank"));
    }

    @Test
    void get() {
        hashTable.put("Mayank", 14);
        hashTable.put("Madhav", 28);
        hashTable.put("Shashank", 4);

        assertEquals(14, hashTable.get("Mayank"));
    }

    @Test
    void size() {
        hashTable.put("Mayank", 14);
        hashTable.put("Mayank", 60);
        hashTable.put("Madhav", 28);
        hashTable.put("Shashank", 4);
        hashTable.put("Shashank", 8);

        assertEquals(3, hashTable.size());
    }
}