import java.util.*;
import java.io.*;

public class E {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);

        // Get the height and width of the chocolate bar
        int R = scnr.nextInt();
        int C = scnr.nextInt();

        // Get the size of the chocolate bar
        int size = R * C;

        // If the size is even, Alf wins
        if (size % 2 == 0) {
            System.out.println("Alf");
        }

        // Otherwise, Beata wins
        else {
            System.out.println("Beata");
        }
    }
}