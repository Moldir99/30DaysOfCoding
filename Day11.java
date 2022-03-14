import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Day11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        // New array creation 6X6:
        int[][] arr = new int[6][6];

        // i = row number;
        for (int i = 0; i < 6; i++){
            // j = column number;
            for (int j = 0; j < 6; j++){
                // To enter array values:
                arr[i][j] = input.nextInt();
            }
        }
        
        // -9 <= A[i][j] <= 9;
        int max = -9 * 9;

        for (int r = 0; r < 6; r++){
            for (int c = 0; c < 6; c++){
                if (c + 2 < 6 && r + 2 < 6){

                    // hourglass sum calculation:
                    int h_sum = arr[r][c] + arr[r][c+1] + arr[r][c+2] +
                                        arr[r+1][c+1] +
                                arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
                                if (h_sum > max) {
                                    max = h_sum;
                                } 
                }
            }
        }
        System.out.println(max);
        
    }
}

/* Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
*/