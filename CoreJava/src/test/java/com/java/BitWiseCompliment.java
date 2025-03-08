package com.java;

import java.util.Scanner;

public class BitWiseCompliment {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("showcase of Not/ComplimentOperators\n");
		System.out.print("please enter your Number :");
		int num=input.nextInt();
		
		int result=~num ;
		System.out.println("Result :"+result);
		input.close();
	}

}
