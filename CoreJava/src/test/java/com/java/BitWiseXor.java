package com.java;

import java.util.Scanner;

public class BitWiseXor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("showcase Bitwise Xor Operators\n");
		System.out.print("please enter number First no. :");
		int first = input.nextInt();
		System.out.print("please enter number Second no. :");
		int second = input.nextInt();
		int result = first ^ second;
		System.out.println("Result :" + result);
		input.close();
	}

}
