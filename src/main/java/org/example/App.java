package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[][] testArrays = {
                {70, 61, 72, 83, 38},
                {7, 2, 76, 4, 99},
                {28, 9, 13, 78, 19},
                {68, 84, 41, 62, 18},
                {37, 57, 40, 13, 50}
        };

        for (int i = 0; i < testArrays.length; i++) {
            Integer[] original = Arrays.copyOf(testArrays[i], testArrays[i].length);
            Integer[] sorted = BubbleSort.sort(testArrays[i]);
            System.out.println("Array " + (i + 1) + ":");
            System.out.println("Original: " + Arrays.toString(original));
            System.out.println("Sorted:   " + Arrays.toString(sorted));
            System.out.println();
        }
    }
}
