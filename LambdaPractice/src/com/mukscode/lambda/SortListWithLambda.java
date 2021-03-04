package com.mukscode.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class SortListWithLambda {

	public static void main(String[] args) {
			ArrayList<Integer> l = new ArrayList<>();
			l.add(10);
			l.add(9);
			l.add(11);
			l.add(0);
			System.out.println(l);
			
			Collections.sort(l, (i1, i2) -> i1.compareTo(i2));
			System.out.println(l);

		}
}
