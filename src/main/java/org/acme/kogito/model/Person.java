package org.acme.kogito.model;

// POJO representing a Person
public class Person {

	private String name;
	private int age;
	private boolean adult;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(final boolean adult) {
		this.adult = adult;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", adult=" + adult + "]";
	}

}
