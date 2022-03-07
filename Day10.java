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

// Task: to convert decimal to binary and count the amount of 1's in binary sequence;


public class Day10 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  // Input number;
        int count = 0, max = 0;
        
        while(n > 0){
            if (n % 2 == 1){    // if number has reminder;
                count++;        // count it;
                if (count > max){   // if count number more than 0;
                    max = count;    // max amout of 1's == count;
                }
            } else {
                count = 0;
            } 
             n = n / 2;  // Divide decimal number by 2;
        }
        System.out.println(max);    // print total number of 1's in bin seq.
        
        input.close();
    
    }
}

