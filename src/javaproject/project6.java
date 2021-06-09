package javaproject;

import java.util.Scanner;

public class project6 {
	public static void main(String[] args) {
		int[] student;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		student = new int[10];
		for (int i = 0; i < 10; i++) {
			student[i] = sc.nextInt();
			sum += student[i];
		}
		System.out.println("ÇÕ°è : " + sum + "\nÆò±Õ : " + (sum / 10));
		sc.close();
	}
}
