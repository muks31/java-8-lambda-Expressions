package com.mukscode.lambda;

public class RunnableUsingLambda{

	public static void main(String[] args) {
		
		Thread t = new Thread(() ->  {
			for(int i=0; i<5; i++) {
			System.out.println("Hello from thread");
			}});
		t.start();
		System.out.println("Hello from Main thread");
	}

}
