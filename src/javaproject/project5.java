package javaproject;

import java.util.Scanner;

public class project5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if (n >= 90)
			System.out.println("학점 : A");
		else if (80 <= n && n < 90)
			System.out.println("학점 : B");
		else if (70 <= n && n < 80)
			System.out.println("학점 : C");
		else if (60 <= n && n < 70)
			System.out.println("학점 : D");
		else
			System.out.println("학점 : F");
		sc.close();
	}

}
