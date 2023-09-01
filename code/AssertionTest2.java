/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;

/**
 *
 * @author ensibs
 * http://www.oracle.com/us/technologies/java/assertions-139853.html
 */

public class AssertionTest2 {

   public static void main(String argv[]) throws IOException {
      System.out.print("Enter your marital status: ");
      int c = System.in.read();
      //Assertion.NDEBUG=false;
      switch ((char) c) {
         case 's':
         case 'S': System.out.println("Single"); break;
         case 'm':
         case 'M': System.out.println("Married"); break;
         case 'd':
         case 'D': System.out.println("Divorced"); break;
         default: Assertion.assertion(!true, "Invalid Option"); break;
      }

   }
}