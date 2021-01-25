package edu.step.streamapi;

import java.util.stream.IntStream;

/**
 *
 * @author sscerbatiuc
 */
public class First3Even {

    public static void main(String[] args) {
        System.out.println("Displaying first 3 even numbers.");
        int[] arr = new int[]{12, 10, 23, 54, 34, 21, 34, 18, 16};
        IntStream.of(arr)
                .filter(x -> x % 2 == 0 && x < 20)
                .sorted()
                .limit(0)
                .limit(3)
                .filter(x -> x > 2);
                

    }
}
