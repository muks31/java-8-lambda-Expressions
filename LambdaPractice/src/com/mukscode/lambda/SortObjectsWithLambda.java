package com.mukscode.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class SortObjectsWithLambda {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee(1, "Mukesh"));
		l.add(new Employee(4, "Muks"));
		l.add(new Employee(0, "Krish"));
		l.add(new Employee(7, "Ram"));
		System.out.println(l);
		Collections.sort(l,(e1,e2) -> e2.name.compareTo(e1.name));
		System.out.println(l);
		

	}

}

class Employee{
	Integer impNo;
	String name;
	
	Employee(int impNo, String name){
		this.impNo  = impNo;
		this.name = name;
	}
	public String toString() {
		return impNo +":"+ name;
	}
}