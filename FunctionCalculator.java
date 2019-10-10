package com.basic;

import java.util.Scanner;

public class FucntionCalculator {

	public static void main(String[] args) {
		int num1, num2, result, num3, ch;
		num1 = num2 = result = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter the Num1: ");
			num1 = sc.nextInt();
			System.out.println("Enter the Num2: ");
			num2 = sc.nextInt();
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			System.out.println("Enter your Choice: ");
			num3 = sc.nextInt();
			switch (num3) {
			case 1:
				result = add(num1, num2);
				System.out.println("The sum of two numbers: " + result);
				break;
			case 2:
				result = sub(num1, num2);
				System.out.println("The subtraction of two numbers: " + result);
				break;
			case 3:
				result = mult(num1, num2);
				System.out.println("The product of two numbers: " + result);
				break;
			case 4:
				result = div(num1, num2);
				System.out.println("The division of two numbers: " + result);
				break;
			default:
				System.out.println("Invalid Choice!");
			}
			System.out.println("Do you wish to continue? 0 for NO, 1 for YES");
			ch = sc.nextInt();
			
		} while (ch == 1);
		sc.close();
	}

	static int add(int n1, int n2) {
		return n1 + n2;
	}

	static int sub(int n1, int n2) {
		return n1 - n2;
	}

	static int mult(int n1, int n2) {
		return n1 * n2;
	}

	static int div(int n1, int n2) {
		return n1 / n2;
	}
}
