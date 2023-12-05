import java.util.*;
import java.io.*;

public class A {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);

        // Loop through the test cases
        int numTests = scnr.nextInt();
        for (int i = 0; i < numTests; i++) {
            int N = scnr.nextInt();

            // Find N!
            int factorial = 1;
            for (int j = 2; j <= N; j++) {
                factorial *= j;
            }

            // Print the last digit of N!
            int lastDigit = factorial % 10;
            System.out.println(lastDigit);
        }
    }
}