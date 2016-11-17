package com.freetipscentral.utility;

public class ConstructorMethodRefEx1 {

	public static void main(String[] args) {
		UserFactory userfactory = User::new;
			
		System.out.println(userfactory.createUser(1, "Tony"));
	}

}
