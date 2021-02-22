package com.mukscode.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercize {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Mukesh", "Rai", 25),
				new Person("Muke", "Rai", 26),
				new Person("Rakesh", "Sharma", 67),
				new Person("Ravi", "verma", 99),
				new Person("Din", "Dayal", 10),
				new Person("Teju", "Rai", 11)
				);

		//step - 1: sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		//step - 2: create a method all elements in the list
		printAll(people);

		//step -3: create a methods that prints all people having last name beginning with R
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("R");
			}
			
		});
	}

	private static void printConditionally(List<Person> people, Condition c) {
		
		for(Person p : people) {
			if(c.test(p)) {
				System.out.println(p);
			}
			
		}

	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}

	}
}
