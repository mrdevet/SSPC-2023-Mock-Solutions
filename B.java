import java.util.*;
import java.io.*;

public class B {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);

        // Read the inputs
        int n = scnr.nextInt();
        String machines = scnr.next();

        // Loop through the lecture halls and count the ones she has coffee for
        int count = 0;
        int coffeesInHand = 0;
        for (int i = 0; i < n; i++) {
            // Check if this lecture hall has a coffee machine
            if (machines.charAt(i) == '1') {
                count++;
                coffeesInHand = 2;
            }

            // Otherwise, check if she has a coffee in her hand
            else if (coffeesInHand > 0) {
                count++;
                coffeesInHand--;
            }
        }

        // Print the count
        System.out.println(count);
    }
}