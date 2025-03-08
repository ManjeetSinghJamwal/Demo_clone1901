package com.java;

public class SubString {

	public static void main(String[] args) {
		String s = "showing 1 to10 of19081(19009 pages)";
		int start = s.indexOf("(") + 1;
		int end = s.indexOf("pages") - 1;
		String sub1 = s.substring(start, end);
		System.out.println(sub1);//for dynamic
		String sub = s.substring(23, 27);
		System.out.println(sub);//for static
		int totalpage=Integer.parseInt(sub);
		int pages=10;
		int sum=totalpage+pages;
		System.out.println(sum);
		
	}

}
