package com.freetipscentral.utility;

import java.util.Locale;
import java.util.function.BiFunction;

public class ConstructorMethodRefEx2 {

	public static void main(String[] args) {
		
		BiFunction<String, String, Locale> localeFactory = Locale::new;
		
		Locale locale = localeFactory.apply("en","US");
		System.out.println(locale);
	}

}
