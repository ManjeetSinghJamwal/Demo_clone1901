package com.java;

public class ReplaceWord {

	public static void main(String[] args) {
		String str = "Hello World";
		String oldstr = "World";
		String newstr = "Java";
		String result = "";
		int len = oldstr.length();
		for (int i = 0; i < str.length(); i++) {
			if (i <= str.length() - len && str.substring(i, i + len).equals(oldstr)) {
				result = result + newstr;
				i = i + len - 1;
			} else {
				result = result + str.charAt(i);
			}
		}
		System.out.println("Modified String :" + result);
	}

}
