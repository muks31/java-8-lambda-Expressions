package com.mukscode.lambda;

public class Add2Nums {

	public static void main(String[] args) {
		
		AddInterface addition = (a,b) -> System.out.println("The addition is: "+(a+b));
		addition.add(100, 34);
	}

}

interface AddInterface{
	public void add(int a, int b);
}
