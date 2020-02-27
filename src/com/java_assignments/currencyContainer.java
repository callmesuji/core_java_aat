package com.java_assignments;

public class currencyContainer {

	public static void main(String[] args) {
		country obj = getcurrency("IND");
		System.out.println(obj.getcurrency());
		obj = getcurrency("USA");
		System.out.println(obj.getcurrency());
		obj = getcurrency("UK");
		System.out.println(obj.getcurrency());

	}

	private static country getcurrency(String string) {
		if (string.equals("IND")) {
			return new IND();
		} else if (string.equals("USA")) {
			return new USA();
		} else if (string.equals("UK")) {
			return new UK();
		}
		return null; // no country matches
	}
}
