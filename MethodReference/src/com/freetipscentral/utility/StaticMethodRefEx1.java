package com.freetipscentral.utility;

import java.util.List;

public class StaticMethodRefEx1 {

	public static void main(String[] args) {
		List<Person> persons = PersonFactory.createPersons();
		persons.forEach(StaticMethodRefEx1::printPerson);
		
		//Consumer interface (object) -> public void accept(Object)
		//accept method has Object as input and has accept method which works on the object
		//Does not return anything

	}
	
	public static void printPerson(Person p) {
		System.out.println(p);
	}

}
