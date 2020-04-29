package edu.step.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author sscerbatiuc
 */
public class WorkingWithNumbers {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 4, 21, 2, 18, 16};

        List<Integer> unique = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
        int max = Arrays.stream(arr).filter(i -> i % 2 == 0).max().orElse(-1);
        IntStream nums = IntStream.of(arr);
        
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
