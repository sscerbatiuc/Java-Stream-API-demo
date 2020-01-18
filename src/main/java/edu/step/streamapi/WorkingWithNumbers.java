package edu.step.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author sscerbatiuc
 */
public class WorkingWithNumbers {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 4, 21, 2, 18, 16};

        Arrays.stream(arr)
                .filter(x -> x < 5)
                .max()
                .ifPresent(x -> System.out.println(x));
//                .getAsInt();

        // sum the elements
        int sum = Arrays.stream(arr)
                .reduce((x, y) -> x + y)
                .getAsInt();
        System.out.println(sum);
    }
}
