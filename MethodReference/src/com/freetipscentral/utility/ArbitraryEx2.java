package com.freetipscentral.utility;

import java.util.function.BiFunction;

public class ArbitraryEx2 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> summation = Integer::sum;
				
		System.out.println(summation.apply(400, 500));
	}
}
