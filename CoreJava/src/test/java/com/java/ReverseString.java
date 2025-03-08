package com.java;

public class ReverseString {

	public static void main(String[] args) {
		String str="java is a pure oops language j j k";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	}

}
