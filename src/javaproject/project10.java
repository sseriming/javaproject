package javaproject;
import java.util.Scanner;

public class project10 {
	 public static int add(int a, int b) {
	      return a + b;

	   }

	   public static int substract(int a, int b) {
	      return a - b;
	   }

	   public static int multiply(int a, int b) {
	      return a * b;
	   }

	   public static double divide(int a, int b) {

	      return (double)a / (double)b;

	   }

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      System.out.print(add(a, b) + "\n");
	      System.out.print(substract(a, b) + "\n");
	      System.out.print(multiply(a, b) + "\n");
	      System.out.print(divide(a, b));
	      sc.close();

	   }

}
