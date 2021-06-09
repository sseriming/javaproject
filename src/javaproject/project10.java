package sserim;

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
		try {
			return a / b;
			
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");			
		}
		
		return b;
	}

	public static void main(String[] args) {
		// (3+5-2)*2/3
		System.out.print("(3+5-2)*2/3 = ");
		System.out.println(divide(multiply(substract(add(3, 5), 2), 2), 3));
	}
}
