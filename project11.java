package sserim;

import java.util.Scanner;

public class project11 {
	public static void main(String[] args) {
		System.out.println("���� : 123-456789  (������ : ȫ�浿)");

		int select;
		int sum = 0;
		int money;

		while (true) {
			System.out.println("1.�ܾ�\n2.�Ա�\n3.���\n4.�ŷ��Ϸ�");
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
			if (select == 1) {
				System.out.println("�ܾ��� " + sum + "�� �Դϴ�.");
			} else if (select == 2) {
				money = sc.nextInt();
				if (money >= 0) {
					sum += money;
					System.out.println("�ܾ� : " + sum + "�� �Դϴ�.");
				} else {
					System.out.println("*���� �Է� �Ұ�* �ٽ� �Է� ���ּ���. ");
					money = sc.nextInt();
					sum += money;
					System.out.println("�ܾ� : " + sum + "�� �Դϴ�.");
				}
			} else if (select == 3) {
				money = sc.nextInt();
				if (money >= 0) {
					sum -= money;
					System.out.println("�ܾ� : " + sum + "�� �Դϴ�.");
				} else {
					System.out.println("*���� �Է� �Ұ�* �ٽ� �Է� ���ּ���.");
					money = sc.nextInt();
					sum -= money;
					System.out.println("�ܾ� : " + sum + "�� �Դϴ�.");
				}
			} else if (select == 4) {
				System.out.println("�ŷ� �Ϸ�. �ȳ���������");
				break;
			} else
				System.out.println("�ٽ� �Է� ���ּ���. ");
		}
	}
}
