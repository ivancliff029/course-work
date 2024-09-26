import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        // Initialize the array
        Integer[] numbers = {5, 3, 8, 1, 2};
        
        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        
        // Print the sorted array
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
    }
}
