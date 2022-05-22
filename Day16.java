// Exceptions - Str to Int;
import java.util.*;

public class Day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        input.close();
        
        try{
            Integer integer = Integer.parseInt(str); // try to execute conversion from str to int;
            System.out.println(integer); // and if convertabl, print an int;
        }
        catch(NumberFormatException err){
            System.out.println("Bad String"); // else execute this instead of error; 
        }
    }
}

// Sample input #1:

// 3;

//Sample output #1:

// 3;

// Sample intput #2:

// qwerty;

// Sample output #2:

// Bad String;

