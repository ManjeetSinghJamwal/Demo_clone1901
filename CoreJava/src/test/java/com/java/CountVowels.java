package com.java;

public class CountVowels {

	public static void main(String[] args) {
		String s="aeiouAEIOU";
		String str=s.toLowerCase();
		int count=0;
		String vowel="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
				vowel=vowel+ch;
			}
		}System.out.println("vowel :"+vowel);
System.out.println("count :"+ count);
	}

}
