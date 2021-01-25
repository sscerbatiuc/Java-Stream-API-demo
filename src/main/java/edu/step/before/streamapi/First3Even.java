package edu.step.before.streamapi;

/**
 *
 * @author sscerbatiuc
 */
public class First3Even {

    public static void main(String[] args) {
        System.out.println("Displaying first 3 even numbers less than 20.");
        int counter = 0;
        int[] arr = new int[]{12, 10, 23, 54, 34, 21, 34, 18, 16};
        
        for (int num : arr) {
            if (num >= 20) {
                continue;
            }
            if (num % 2 == 0) {
                System.out.println(num);
                counter++;
            }
            if (counter == 3) {
                break;
            }
        }
    }
}
