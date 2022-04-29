import java.io.*;
import java.util.*;

abstract class Book{

  String title;
  String author;
  int price;

  Book(String title, String author, int price){
    this.title = title;
    this.author = author;
    this.price = price;
  }
  
  abstract void display();
}

class MyBook extends Book{

  MyBook(String title, String author, int price){
    super(title, author, price);
  }

  @Override
  void display(){
    System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    // System.out.println("Author: " + author);
    // System.out.println("Price: " + price);
  }
}


public class Day13 {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      //System.out.println("Enter below data: ");
      String title = scan.nextLine();
      String author = scan.nextLine();
      int price = scan.nextInt();

      Book newBook = new MyBook(title, author, price);
      newBook.display();
      scan.close();
    }
}
