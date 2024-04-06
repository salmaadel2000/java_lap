import java.util.Arrays;
import java.util.Random;

class task2 {
    public static void main(String args[]) {
        int arr[];
        arr = new int[1000];

        // Initialize using random 

        // Create instance of Random class
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rand_val = rand.nextInt(1000);
            arr[i] = rand_val;

        }

        // Sort the array for binary search
        Arrays.sort(arr);

        // Measure start time
        long startTime = System.nanoTime();

        // Find min and max value using binary search
        int min = arr[0];
        int max = arr[arr.length - 1];

        // Measure end time
        long endTime = System.nanoTime();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // Calculate and print elapsed time
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
    }
}