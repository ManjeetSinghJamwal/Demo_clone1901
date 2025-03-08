package com.java;

public class ReverseWord {

	public static void main(String[] args) {
		String str="java is a pure oops language j j k";
		String word[]=str.split(" ");
		String RevWord="";
		for(int i=word.length-1;i>=0;i--) {
			RevWord=RevWord+word[i].toString();
			
		}
		System.out.println(RevWord);
	}

}
