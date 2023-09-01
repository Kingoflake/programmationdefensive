/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensibs
 */
import java.util.Scanner;
import java.io.IOException;

public class AssertionTest1 {
   public static void main(String argv[]) throws IOException {
      Scanner reader = new Scanner(System.in);      
      System.out.print("Enter your age: ");
      int age = reader.nextInt();
      //Assertion.NDEBUG=false;
      //Assertion.
      Assertion.assertion(age>=18, "You are too young to vote");
      // use age
      System.out.println("You are eligible to vote");
   }
}