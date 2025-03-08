package com.java;

public class CheckPalindrome {

	public static void main(String[] args) {
		String str = "Madam";
		
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equalsIgnoreCase (rev)) {
			System.out.println(str+": is a Palindrome");
		} else {
			System.out.println(str+": is not a Palindrome");
		}
	
	System.out.println("toLowerCase :"+str.toLowerCase());
	System.out.println("toUpperCase :"+str.toUpperCase());
	}

}
