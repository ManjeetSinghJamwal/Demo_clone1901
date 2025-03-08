package com.java;

import java.util.Scanner;

public class RightShift {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Showcase of LeftShift\n");
		System.out.print("please enter your Number :");
		int num = input.nextInt();

		int result = num >> 2;
		System.out.println("Result :" + result);
		input.close();
	}

}
