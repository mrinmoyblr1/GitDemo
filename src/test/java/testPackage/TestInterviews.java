package testPackage;
import java.util.Scanner;
public class TestInterviews {
	 public static void main(String[] args) {
	  method(null);
	 }
	 public static void method(Object o) {
	  System.out.println("Object method");
	 }
	 public static void method(String s) {
	  System.out.println("String method");
	  // How to swap two Integers without using temporary variable in Java
	  int a=10;
	    int b=20;
	    System.out.println(a);
	    System.out.println(b);
	    a = a + b; 
	    b = a - b;
	    a = a - b;
	    System.out.println(a);
	    System.out.println(b);
	    //given number is a leap year?
	    /*
	    1. Take integer variable year
	    2. Assign a value to the variable
	    3. Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
	    4. Check if the year is divisible by 400, DISPLAY "leap year"
	    5. Otherwise, DISPLAY "not leap year"  
	    */
		
		  int year; System.out.println("Enter an Year :: "); Scanner sc = new
		  Scanner(System.in); year = sc.nextInt(); if (((year % 4 == 0) && (year %
		  100!= 0)) || (year%400 == 0))
		  System.out.println("Specified year is a leap year"); else {
		  System.out.println("Specified year is not a leap year"); }
		  
		     

	 }
}
