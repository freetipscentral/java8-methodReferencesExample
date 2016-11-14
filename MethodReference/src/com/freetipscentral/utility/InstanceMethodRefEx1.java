package com.freetipscentral.utility;

import java.util.List;

public class InstanceMethodRefEx1 {

	public static void main(String[] args) {
		
		InstanceMethodRefEx1 ex1 = new InstanceMethodRefEx1();
		List<Person> persons = PersonFactory.createPersons();
		//persons.forEach(ex1::printPerson);
		persons.forEach(System.out::println); 
		//Consumer interface (object) -> public void accept(Object)
		//accept method has Object as input and has accept method which works on the object
		//Does not return anything

	}
	
	public void printPerson(Person p) {
		System.out.println(p);
	}

}
