package OOPS;

public class _1_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("It is simply Method Overloading \n" + "2 types - compiler-time & runtime");
	}

}

class Human {
	String name;

	void walk() {
		System.out.println(this.name + " is walking");
	}

	void walk(int steps) {
		System.out.println(name + " has walked " + steps);
	}
}
