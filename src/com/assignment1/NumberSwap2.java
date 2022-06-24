package com.assignment1;

import java.util.Scanner;

public class NumberSwap2 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		num2 = scanner.nextInt();
		System.out.println("Entered Numbers are: " + num1 + " and " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Swapped Numbers are: " + num1 + " and " + num2);
	}

}
