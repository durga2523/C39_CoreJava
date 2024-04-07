package com.tns.daytwo;

//get and set is a built-in method
public class Encapsulation_demo1 {
	// data members or datatypes
	private String name;
	private int age;
	private int runs;

	public String getName() {
		return name;
	}

	// void is a return type method
	public void setName(String name) {
		// "this" denote a specific modifier(point out ) ans . is modifier is used to
		// connect
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// void is a return type method
	public void setAge(int age) {
		// "this" denote a specific modifier(point out ) ans . is modifier is used to
		// connector operator
		this.age = age;
	}

	public int getRuns() {
		return runs;
	}

	// void is a return type method
	public void setRuns(int runs) {
		// "this" denote a specific modifier(point out ) ans . is modifier is used to
		// connect
		this.runs = runs;
	}

	// override code //toString is a method (having two intergers )
	// + is concatination means join one string to another string
	public String toString() {
		return "CSK[Name = " + name + ",Age=" + age + ",Runs=" + runs + "]";
	}

	public static void main(String[] args) {
		Encapsulation_demo1 obj = new Encapsulation_demo1();

		obj.setName("MSD"); 
		obj.setAge(42);
		obj.setRuns(250);
		System.out.println(obj);
//		System.out.println(obj.getName());
//		System.out.println(obj.getAge());
//		System.out.println(obj.getRuns());

	}

}
