package com.freetipscentral.utility;

import java.util.Arrays;
import java.util.List;

public class ArbitraryEx1 {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(8,12,55,23,98,12,666,2333);
		number.sort(Integer::compareTo);
		
		number.forEach(System.out::println);
	}
}
