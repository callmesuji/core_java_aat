package com.strings_Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffered_reader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter no of elements ");
		int n = Integer.parseInt(br.readLine());
		System.out.print("enter the elements :");
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		ispal(str);
	}

	private static void ispal(String[] str) {
		// String b = "";
		int count = 0;
		for (String a : str) {
			int n = a.length();
			String b = "";
			for (int i = n - 1; i >= 0; i--) {
				b += a.charAt(i);
			}
			if (a.equalsIgnoreCase(b)) {
				count++;
			}
		}
		System.out.println("no of palindromes in array is : " + count);
	}
}
