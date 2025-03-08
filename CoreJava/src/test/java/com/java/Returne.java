package com.java;

import java.util.Scanner;

public class Returne {
	public static void greet() {
		System.out.println("Welcome to Calculator\n");
	}

	/** method use as input variable */
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter value :");
		int number = input.nextInt();
		return number;

	}

	public static void main(String[] args) {
		greet();
		int first = readNumber();
		int second = readNumber();
		int sum = first + second;
		System.out.println(sum);

	}

}
