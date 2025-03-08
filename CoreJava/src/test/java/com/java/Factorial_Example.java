package com.java;

import java.util.Scanner;

public class Factorial_Example {
	public static long factorial(int num) {
		if (num < 2) {
			return 1;
		}
		long fact = 1;
		int i = 2;
		while (i <= num) {
			fact = fact * i;
			i++;
		}

		return fact;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Factorial\n");
		System.out.print("Please enter your number :");
		int num = input.nextInt();
		long fact = factorial(num);
		System.out.println("Factorial is:" + fact);

		input.close();
	}
}
