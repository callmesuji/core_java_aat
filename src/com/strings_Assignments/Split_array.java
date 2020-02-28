package com.strings_Assignments;

public class Split_array {

	public static void main(String[] args) {
		String str = "aba, 321, 12321,abc, abcba, lamnmal,3445 ,456, 678";

		String[] arr = str.split(",");
		

	}

	private static boolean ispalindrome(String s) {

		return new StringBuilder(s).reverse().toString().equals(s);
	}

}

/*
 * for (int i = 0; i < str.length; i++) { System.out.println(str[i]); if
 * (ispalindrome(str[i])) { System.out.println(str[i]); } else {
 * System.out.println("false"); } }
 */