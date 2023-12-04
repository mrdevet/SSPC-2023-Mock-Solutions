import java.util.*;
import java.io.*;

public class D {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);

        // Get the limit
        int m = scnr.nextInt();

        // Array to hold the sums
        int maxBase = (int) Math.ceil(Math.cbrt(m));
        int maxSums = maxBase * maxBase;
        int [] sums = new int [maxSums];

        // Loop through pairs of cubes to find the sums
        int k = 0;  // k is the current index of sums
        for (int i = 1; i < maxBase; i++) {
            int iCubed = i * i * i;
            for (int j = i; j < maxBase; j++) {
                int jCubed = j * j * j;
                int sum = iCubed + jCubed;
                if (sum > m) {
                    break;
                }
                sums[k] = sum;
                k++;
            }
        }

        // Copy the elements to a smaller array to be sorted
        int [] oldSums = sums;
        sums = new int [k];
        for (int i = 0; i < k; i++) {
            sums[i] = oldSums[i];
        }
        Arrays.sort(sums);

        // Find the biggest bus number
        // This will be the highest number that appears multiple times in sums
        for (int i = k - 1; i > 0; i--) {
            if (sums[i] == sums[i - 1]) {
                System.out.println(sums[i]);
                return;
            }
        }

        // If we get here, no bus numbers were found
        System.out.println("none");
    }
}