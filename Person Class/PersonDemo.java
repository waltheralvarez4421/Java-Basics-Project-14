import java.util.Scanner;
import java.util.Arrays;

/**
   Walther Alvarez
   CISC 500
   Assignment #14
   This class tests the Person class.
   Prompts the user to enter names and then returns the first and last names.
*/
public class PersonDemo
{
   public static void main(String[] args)
   {
      int count = 0;
      Scanner in = new Scanner(System.in);
      
      boolean more = true;
      Person first = null;
      Person last = null;
      while (more)
      {
         System.out.println("Please enter the person's name or a blank line to quit");
         String name = in.nextLine();
         
         if (name.equals(""))
            more = false;
         else
         {
            Person p = new Person(name);

            if (first == null) first = last = p; 
            else 
            { 
               if (first.compareTo(p) > 0) first = p; 
               if (last.compareTo(p) < 0) last = p; 
            } 
         } 
      }
      
      System.out.println("First: " + first);
      System.out.println("Last: " + last);
   }
}