package datastructures;

public class HashTables<K, V> {

    private int INITIAL_SIZE = 16;
    private HashEntry<K, V>[] entries;

    class HashEntry<K, V> {
        K key;
        V value;
        HashEntry<K, V> next;

        public HashEntry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

    }

    HashTables() {
        entries = new HashEntry[INITIAL_SIZE];
    }

    public void put(K key, V value) {
        int index = getIndex(key);

        HashEntry<K, V> entry = new HashEntry<>(key, value);

        if (entries[index] == null) {
            entries[index] = entry;
        } else {
            HashEntry<K, V> hashEntries = entries[index];
            while (hashEntries.next != null) {
                hashEntries = hashEntries.next;
            }
            if (hashEntries.key.equals(key)) {
                hashEntries.value = value;
                return;
            }
            hashEntries.next = entry;
        }
    }

    public V get(K key) {
        int index = getIndex(key);

        HashEntry<K, V> hashEntries = entries[index];

        if (hashEntries != null) {
            while (!hashEntries.key.equals(key) && hashEntries.next != null) {
                hashEntries = hashEntries.next;
            }

            return hashEntries.value;
        }

        return null;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                HashEntry<K, V> hashEntries = entries[i];
                while (hashEntries != null) {
                    size++;
                    hashEntries = hashEntries.next;
                }
            }
        }
        return size;
    }

    private int getIndex(K key) {
        int hashCode = Math.abs(key.hashCode());

        System.out.println("Hash code = " +hashCode);

        int index = hashCode % INITIAL_SIZE;

        System.out.println("Index = " + index);

        return index;
    }
}
