package org.totalbeginner.tutorial;

public class Person {
	//fields
	private String name; //name of the person
	private int maximumBooks; //max number ofbooks zu check out
	// constructors
	public Person() {
		// Test
		name = "unknown name";
		maximumBooks = 3;	
	}
	
	// methods
	public String getName() {
		return name;
	}
	public void setName(String anyName) {
		name = anyName;
	}
	public int getMaximumBooks() {
		return maximumBooks;
	}
	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
}
