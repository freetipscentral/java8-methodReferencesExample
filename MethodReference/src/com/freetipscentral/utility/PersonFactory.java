package com.freetipscentral.utility;

import java.util.ArrayList;
import java.util.List;

public class PersonFactory {
	public static List<Person> createPersons() {
		List<Person> persons = new ArrayList<Person>();
		Person p1 = PersonBuilder.createPerson().withAge(21)
				.withName("Matt")
				.withGender(Gender.MALE)
				.withAreaCode(61244)
				.build();
		persons.add(p1);
		Person p2 = PersonBuilder.createPerson().withAge(33)
				.withName("Alex")
				.withGender(Gender.MALE)
				.withAreaCode(61244)
				.build();
		persons.add(p2);
		Person p3 = PersonBuilder.createPerson().withAge(30)
				.withName("Cindy")
				.withGender(Gender.FEMALE)
				.withAreaCode(61244)
				.build();
		persons.add(p3);

		Person p4 = PersonBuilder.createPerson().withAge(29)
				.withName("Srini")
				.withGender(Gender.MALE)
				.withAreaCode(50131)
				.build();
		persons.add(p4);
		Person p5 = PersonBuilder.createPerson().withAge(41)
				.withName("Paul")
				.withGender(Gender.MALE)
				.withAreaCode(50131)
				.build();
		persons.add(p5);
		Person p6 = PersonBuilder.createPerson().withAge(24)
				.withName("Mindy")
				.withGender(Gender.FEMALE)
				.withAreaCode(50131)
				.build();
		persons.add(p6);

		return persons;
	}
}
