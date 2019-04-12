/**
  Walther Alvarez
  CISC 500
  Assignment #14
 A person with a name.
*/
/** 
   A person. 
*/ 
public class Person implements Comparable 
{ 
   /** 
      Constructs a Person object. 
      @param aName the name of the person 
   */ 
   public Person(String aName) 
   { 
      name = aName; 
   } 
   
   public String getName() 
   { 
      return name; 
   } 

   public int compareTo(Object otherObject) 
   { 
     Person other = (Person)otherObject;
     if (name.compareTo(other.name) < 0) return -1;
     if (name.compareTo(other.name)  > 0) return 1;  
     return 0; 
   } 
   
   /** 
      Gets the name of the person. 
      @return the name of the person 
   */ 
   public String toString() 
   { 
       return "Person[name=" + name + "]"; 
   } 
   private String name; 
} 