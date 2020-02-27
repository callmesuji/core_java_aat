package com.arrays;

import java.util.Scanner;

public class SubsetOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of big array");
		int n = sc.nextInt();
		System.out.println("enter the elements :");
		int[] barr = new int[n];
		for (int i = 0; i < barr.length; i++) {
			barr[i] = sc.nextInt();
		}
		System.out.println("enter the size of small array");
		int m = sc.nextInt();
		System.out.println("enter the elements :");
		int[] sarr = new int[m];
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = sc.nextInt();
		}
		boolean issubset = issubset(barr, sarr);
		if (issubset == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}

	private static boolean issubset(int[] barr, int[] sarr) {
		int count = 0;
		for (int i = 0; i < sarr.length; i++) {
			for (int j = 0; j < barr.length; j++) {
				if (sarr[i] == barr[j]) {
					count++;
					break;
				}

			}
		}
		return count == sarr.length;
	}
}
