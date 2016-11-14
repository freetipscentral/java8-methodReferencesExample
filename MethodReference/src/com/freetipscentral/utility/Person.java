package com.freetipscentral.utility;

public class Person {
	String name;
	int age;
	Gender gender;
	int areaCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	
	public String toString() {
		return "Name : "+name+" Age : "+age+" Gender : "+gender+" Area Code : "+ areaCode;
	}
	
}
