import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt();
        input.nextLine();

        for(int i = 0; i < T; i++){
            
            String str = input.nextLine();
           
            // Split string to chars;
            char[] charArr = str.toCharArray();
            
            // Create new empty lists to store characters
            List<Character> even = new ArrayList<Character>();
            List<Character> odd = new ArrayList<Character>();
            
            // Going through character indexes;
            // Adding even and odd indexed characters to the respective lists;
            for(int j = 0; j < charArr.length; j++){

                if (j % 2 == 0){

                    even.add(charArr[j]);    
                }
                else{

                    odd.add(charArr[j]);    
                }
               
            }

            // Object creation of StringBuilder class:
            // Or simply builing a string;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            // Appending characters to the string:
            for (Character ch : even) {
                sb.append(ch);
            }

            for (Character ch2 : odd) {
                sb2.append(ch2);
            }

            // Convert to string:
            String string = sb.toString();
            String string2 = sb2.toString();
           
            // Printing out results:
            System.out.print(string + " " + string2); 
            System.out.println(); 
            
            

        }
        
    }
}
