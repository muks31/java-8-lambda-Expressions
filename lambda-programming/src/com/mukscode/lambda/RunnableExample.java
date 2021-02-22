package com.mukscode.lambda;

public class RunnableExample {

	
	
	public static void main(String[] args) {
		
		//Approch - 1: Using Anonymous Inner class
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Running inside Runnable Inner class");
				
			}
			
		});
		myThread.run();
		
		//Approach - 2: Using Lambda
		Thread lambdaThread = new Thread(() -> System.out.println("Running Inside Lambda"));
		lambdaThread.run();

	}

}
