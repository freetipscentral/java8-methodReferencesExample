package com.freetipscentral.utility;

import java.util.function.Supplier;

public class InstanceMethodRefEx2 {

	public static void main(String[] args) {
		
		InstanceMethodRefEx2 ex2 = new InstanceMethodRefEx2();
		Supplier<User> userSupplier = ex2::createUser;
		System.out.println(userSupplier.get());

		//Supplier Interface represented as () -> Method name
		// Does not take any input
		//Returns the object when get() method is invoked

	}
	
	public User createUser() {
		User user = new User(1,"Nilendu");
		return user;
	}

}
