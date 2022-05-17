// Topic: Linked Lists;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Day15 {

    public static  Node insert(Node head,int data) {
         
         // Recursive method:
         if(head == null){
             return new Node(data);
         }
         else{
             head.next = insert(head.next, data);
         }
         return head;
         
        
        // General method: 
        //  Node curr = head;
        //  Node temp = null;
         
        //  if (curr == null){
        //      temp = new Node(data);
        //      curr = temp;
        //      return temp;
        //  }
        //  else{ 
        //      while(curr.next != null){
        //          curr = curr.next;
        //      }
             
        //      curr.next = new Node(data);
        //      return head;
        //  }
         
         
        
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
      
        sc.close();
    }
}

// Input:
// T = 4; // number of elements to insert;
// 2
// 3
// 4
// 1

// Output:
// 2 3 4 1

