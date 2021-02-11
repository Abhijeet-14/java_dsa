package OOPS;

public class __MainClass {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 24;
		p1.name = "Anuj";

		Person p2 = new Person();
		p2.age = 23;
		p2.name = "Abhijeet";

		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.name + " " + p2.age);
		
		p1.walk();
		p2.eat();
		p1.walk(10);
		
		System.out.println(Person. count);
	}

}

class Person {
	// Properties of class object
	String name;
	int age;

	
	// CLASS PROPERTY - use static keyword to make class property
	static int count = 0;
	
	
	// CONSTRUCTOR
	public Person() {
		count++; 
	}
	
	public Person(int age, String name) {
		this();
		this.age = age;
		this.name = name;
	}
	
	
	// Behavior
	void eat() {
		System.out.println(this.name + " is Eating");
	}

	void walk() {
		System.out.println(this.name + " is walking");
	}
	
	void walk(int steps) {
		System.out.println(name + " has walked " + steps);
	}
}