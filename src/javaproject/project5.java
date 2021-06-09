package javaproject;

import java.util.Scanner;

public class project5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if (n >= 90)
			System.out.println("ÇÐÁ¡ : A");
		else if (80 <= n && n < 90)
			System.out.println("ÇÐÁ¡ : B");
		else if (70 <= n && n < 80)
			System.out.println("ÇÐÁ¡ : C");
		else if (60 <= n && n < 70)
			System.out.println("ÇÐÁ¡ : D");
		else
			System.out.println("ÇÐÁ¡ : F");
		sc.close();
	}

}
