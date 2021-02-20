package com.mukscode.lambda;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		//approach-1
		HelloWorldGreeting hello = new HelloWorldGreeting();
		greeter.greet(hello);
		
		//approach -2 : Using Anonymous Inner class
		Greeting myGreeting = new Greeting() {

			@Override
			public void perform() {
				System.out.println("Hello people!");
			}
			
		};
		
		myGreeting.perform();
		
		//approach - 3: Using Lambda Expression
		MyLmbda myLambdaFunction = () -> System.out.println("Hello people!");
		myLambdaFunction.foo();
		
		MyAdd addFunction = (int a, int b) -> a + b;

	}
	
}

interface MyLmbda{
	
	void foo();
	
}

interface MyAdd{
	
	int add(int x, int y);
}