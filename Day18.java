// Day 18 - Stacks and Queues:
// Task: to check if the word is palindrome;

import java.io.*;
import java.util.*;

public class Solution {
    
    // One method:
    
    // But first note:
    // While you cannot create an instance of Queue, 
    // you can create an instance of its implementing classes. 
    // LinkedList is an implementing class of Queue.
    
    // Stack<Character> stack = new Stack<>();
    // Queue<Character> queue = new LinkedList<>();
  
  // ------------------------------------------------------------------- 
  
    // Another method:
    // private LinkedList stack;
    // private LinkedList queue;

    // public Solution() {
    //     this.stack = new LinkedList();
    //     this.queue = new LinkedList();
    // }

    // private char popCharacter() {
    //     return (char) this.stack.pop();
    // }

    // private void pushCharacter(char c) {
    //     this.stack.push(c);
    // }

    // private char dequeueCharacter() {
    //     return (char) this.queue.remove(0);
    // }

    // private void enqueueCharacter(char c) {
    //     this.queue.addLast(c);
    // }
    
  // -------------------------------------------------------------------
  
    // Another method:
    LinkedList<Character> queue = new LinkedList<>();
    LinkedList<Character> stack = new LinkedList<>();
    
    public void pushCharacter(char ch){
        stack.push(ch);
    }
    
    public void enqueueCharacter(char ch){
        queue.add(ch);
    }
    
    public char popCharacter(){
        return stack.pop(); 
    }
    
    public char dequeueCharacter(){
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}

// ------------------------------------------------------------------------

// Sample input:
// racecar

// Sample output:
// The word, racecar is a palindrome.
