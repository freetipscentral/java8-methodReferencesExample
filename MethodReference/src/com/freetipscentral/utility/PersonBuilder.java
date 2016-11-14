package com.freetipscentral.utility;

public class PersonBuilder {
	
	Person p1;
	
	public PersonBuilder(Person p1){
		this.p1 = p1;
	}
	
	public static PersonBuilder createPerson() {
		return new PersonBuilder(new Person()); 
	}
	
	public PersonBuilder withName(String name) {
		p1.setName(name);
		return this;
	}
	
	public PersonBuilder withAge(int age) {
		p1.setAge(age);
		return this;
	}
	
	public PersonBuilder withGender(Gender gender) {
		p1.setGender(gender);
		return this;
	}
	
	public PersonBuilder withAreaCode(int areaCode) {
		p1.setAreaCode(areaCode);
		return this;
	}
	
	public Person build() {
		return p1;
	}
}
