package com.mukscode.lambda;

import java.util.TreeSet;

public class TreeSetWithLambda {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(10);
		tree.add(9);
		tree.add(8);
		tree.add(12);
		System.out.println(tree);
		
		TreeSet<Integer> tree2 = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
		tree2.add(10);
		tree2.add(9);
		tree2.add(8);
		tree2.add(12);
		System.out.println(tree2);
	}

}