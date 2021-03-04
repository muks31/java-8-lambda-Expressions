package com.mukscode.lambda;

public class PreditcateExample {

	public static void main(String[] args) {

		Predicate<Integer> checkAgeGreaterThan10 = i -> i>10;
		System.out.println(checkAgeGreaterThan10(100)); //true
	}
}

