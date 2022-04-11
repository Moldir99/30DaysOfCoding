import java.io.*;
import java.util.*;

class Person{
    
     // Variables:
    protected String firstName;
    protected String lastName;
    protected int ID;
     
     // Constructor:
     public Person(String f_Name, String l_Name, int id){
         this.firstName = f_Name;
         this.lastName = l_Name;
         this.ID = id;
     }
     
     // Print person data other method, more efficient:
    // public void printPerson() {
    //     System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    // }
}
    
class Student extends Person{
    // Variables:
    public int[] scores;
    
    //Contructor:
    public Student(String f_Name, String l_Name, int id, int[] scores){
        super(f_Name, l_Name, id);
        this.scores = scores;
    }
    
    char calculate(){
        
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        int ave = sum/scores.length;
        
        if (ave >= 90 && ave <= 100){
            return 'O';
        }
        else if (ave >= 80 && ave < 90){
            return 'E';
        }
        else if (ave >= 70 && ave < 80){
            return 'A';
        }
        else if (ave >= 55 && ave < 70){
            return 'P';
        }
        else if (ave >= 40 && ave < 55){
            return 'D';
        }
        return 'T';
    }
}

public class Day12 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        //System.out.println("Please, enter data below:");
        String f_Name = in.next();
        String l_Name = in.next();
        int id = in.nextInt();
        int scores_num = in.nextInt();
        int[] scores = new int[scores_num];
        for(int i = 0; i < scores_num; i++){
            scores[i] = in.nextInt();
        }
        
        Student st = new Student(f_Name, l_Name, id, scores);
        System.out.println("Name: " + st.lastName + ", " + st.firstName);
        System.out.println("ID: " + st.ID);
        System.out.println("Grade: " + st.calculate());
        
    }
}
