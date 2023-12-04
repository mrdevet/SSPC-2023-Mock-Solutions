import java.util.*;
import java.io.*;

public class C {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);

        // Read the inputs
        int N = scnr.nextInt();
        int M = scnr.nextInt();
        int K = scnr.nextInt();

        int [] plots = new int [N];
        for (int i = 0; i < N; i++) {
            plots[i] = scnr.nextInt();
        }

        int [] circles = new int [M];
        for (int i = 0; i < M; i++) {
            circles[i] = scnr.nextInt();
        }

        int [] squares = new int [K];
        for (int i = 0; i < K; i++) {
            squares[i] = scnr.nextInt();
        }

        // This array holds the radius of the smallest circle 
        // that fits around each house
        //  - for circles this is just the radius + 1
        //  - for squares this is half the length of the diagonal
        int [] minPlots = new int [M + K];
        for (int i = 0; i < M; i++) {
            minPlots[i] = circles[i] + 1;
        }
        for (int i = 0; i < K; i++) {
            minPlots[M + i] = (int) Math.ceil(squares[i] / Math.sqrt(2));
        }

        // Sort the arrays
        Arrays.sort(plots);
        Arrays.sort(minPlots);

        // Go through the arrays and greedily assign each house to a plot (if possible)
        int count = 0;
        int j = N - 1; // j is the plot index
        for (int i = M + K - 1; i >= 0; i--) { // i is the house index
            // If there are no plots left, end the loop
            if (j < 0) {
                break;
            }

            // If the current house fits in the current plot, count it and go to next plot
            if (minPlots[i] <= plots[j]) {
                count++;
                j--;
            }
        }

        // Print the result
        System.out.println(count);
    }
}