package com.java;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
//		int num=100;
//		while(num<=1000) {
//			System.out.println(num);
//			num++;
//		}
//
//	int numm=500;
//	while(numm>=200) {
//		System.out.println(numm);
//		numm--;
//	}
	Scanner input=new Scanner(System.in);
    int num=0;
    while(num<5) {
	int n=input.nextInt();
	System.out.print("Your Number is :"+ n);
	num++;
	}
    input.close();
	}
}
