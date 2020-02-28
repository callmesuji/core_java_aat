package com.strings_Assignments;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements :");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the elements :");
		String[] s = new String[num];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextLine();
		}

		// String[] s = { "mom, sujith,123, 321, 12321,abc, abcbc, lamnmnl,3445 ,456,
		// 678" };

		ispal(s);
		sc.close();
	}
	private static void ispal(String[] s) {
		int count = 0;
		for (String a : s) {
			int n = a.length();
			String b = "";
			for (int i = n - 1; i >= 0; i--) {
				b += a.charAt(i);
			}
			if (a.equalsIgnoreCase(b)) {
				count++;
			}
		}
		System.out.println(s.length);
		System.out.println("no of palindromes in array is :" + count);
	}
}