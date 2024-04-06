import java.util.Random;

class task1  {
    public static void main(String args[]) {
        int arr[];
        arr = new int[1000];

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rand_val = rand.nextInt(1000);
            arr[i] = rand_val;

        }
        
        long startTime = System.nanoTime();

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        long endTime = System.nanoTime();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
    }
}
