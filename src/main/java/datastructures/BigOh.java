package datastructures;

public class BigOh {

    public void foo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // ...
        }

        for (int i = 0; i < array.length; i++) {
            // ...
        }
    }

    public void bar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                // ...
            }

        }
    }

    public void baz(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    // ...
                }
            }
        }
    }

    public void beep(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < 999999999; k++) {
                    // ..
                }
            }
        }
    }
}
