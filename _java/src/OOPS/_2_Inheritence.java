package OOPS;

public class _2_Inheritence {

	public static void main(String[] args) {
		Person p1 = new Person(24, "Anuj");

		Person p2 = new Person(20, "Abhijeet");

		
		// Create child object
		Developer d1 = new Developer(24, "Om Bharitya");
		d1.eat();
		d1.walk();
	}

}

// Child
class Developer extends Person{

	public Developer(int age, String name) {
		super(age, name);	// it will call parent constructor which has same arguments
	}
	
	// Polymorphism - RUNTIME
	void walk() {
		System.out.println("Developer " + name + " is walking.");
	}
	
}

// Parent
class Person {
	String name;
	int age;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	void eat() {
		System.out.println(this.name + " is Eating");
	}

	void walk() {
		System.out.println(this.name + " is walking");
	}
	

}
