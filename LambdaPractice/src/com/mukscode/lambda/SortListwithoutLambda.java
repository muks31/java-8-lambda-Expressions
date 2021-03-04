package com.mukscode.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortListwithoutLambda {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(9);
		l.add(11);
		l.add(0);
		System.out.println(l);
		
		Collections.sort(l, new myComparator());
		System.out.println(l);

	}

}

class myComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2) {
			return -1;   
		}
		else if(o1 < o2) {
			return 1;
		}
		else {
		return 0;
		}
	}
	
}