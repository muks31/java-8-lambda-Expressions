package com.mukscode.lambda;

import java.util.TreeMap;

public class TreeMapWithLambda {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "Mukesh");
		map.put(0, "Muks");
		map.put(7, "Raj");
		map.put(5, "Krishna");
		System.out.println(map);
		
		TreeMap<Integer, String> map2 = new TreeMap<>((i1, i2) -> i2.compareTo(i1));
		map2.put(1, "Mukesh");
		map2.put(0, "Muks");
		map2.put(7, "Raj");
		map2.put(5, "Krishna");
		System.out.println(map2);

	}

}
