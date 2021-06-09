package javaproject;

import java.util.Random;

public class project91 {
	public static void main(String[] args) {
		Random rd = new Random();
		int sum = 0;
		int[] score = new int[5];
		System.out.print("A : ");
		for (int i = 0; i < 5; i++) {
			score[i] = rd.nextInt(100) + 1;
			sum += score[i];
			System.out.print(score[i] + " ");
		}	
		System.out.println("\nSum <A> : " + sum + "\n");
		int sum1 = 0;
		int[] bscore = new int[5];
		System.out.print("B : ");
		for (int j = 0; j < 5; j++) {
			bscore[j] = rd.nextInt(100) + 1;
			sum1 += bscore[j];
			System.out.print(bscore[j] + " ");
		}
		System.out.println("\nSum <B> : " + sum1);

	}

}
