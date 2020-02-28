package com.strings_Assignments;

public class String_Split {

	public static void main(String[] args) {
		String s = "liril, pop, mom-dad, tat-pop, abba";
		String arr[] = s.split("[ , -]");
		for (String str : arr) {
			String arr2[] = str.split(",");
			if (arr2.length == 0) {
				if (ispalindrome(str)) {
					System.out.println(str);
				}
			} else if (arr2.length != 0) {
				for (String str2 : arr2) {
					if (ispalindrome(str2)) {
						System.out.println(str2);
					}
				}
			}
		}
	}
	

	public static boolean ispalindrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
	}
}