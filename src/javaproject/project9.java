package javaproject;

import java.util.Scanner;

public class project9 {
	public static void main(String[] args) {
		String input = "";
		String output = "";
		int tmp;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			tmp = (int) input.charAt(i);
			if (65 <= tmp && tmp <= 90) {
				output += (char) (tmp + 3);
			} else if (97 <= tmp && tmp <= 122) {
				output += (char) (tmp + 3);
			} else {
				output += (char) (tmp);
			}
		}
		System.out.println(output);
		sc.close();
	}
}
