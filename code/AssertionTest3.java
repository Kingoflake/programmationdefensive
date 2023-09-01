/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensibs
 */
import java.io.*;

public class AssertionTest3 {

   public static void main(String argv[]) throws IOException {
      System.out.print("Enter your marital status: ");
      int c = System.in.read();
      switch ((char) c) {
         case 's':
         case 'S': System.out.println("Single"); break;
         case 'm':
         case 'M': System.out.println("Married"); break;
         case 'd':
         case 'D': System.out.println("Divorced"); break;
         default: assert !true : "Invalid Option"; break;
      }

   }
}
