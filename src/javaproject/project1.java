package javaproject;
import java.util.Scanner;

public class project1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double cel = sc.nextDouble();
		double fahr = (cel * 1.8) +32;
		System.out.println("���� : "+cel+"�� �� ȭ���� "+fahr+"�Դϴ�.");
		sc.close();
	}
}
