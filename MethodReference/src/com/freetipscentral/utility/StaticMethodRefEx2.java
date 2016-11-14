package com.freetipscentral.utility;

import java.util.function.Supplier;

public class StaticMethodRefEx2 {

	public static void main(String[] args) {
		Supplier<User> userSupplier = StaticMethodRefEx2::createUser;
		System.out.println(userSupplier.get());

		//Supplier Interface represented as () -> Method name
		// Does not take any input
		//Returns the object when get() method is invoked

	}
	
	public static User createUser() {
		User user = new User(1,"Nilendu");
		return user;
	}

}
