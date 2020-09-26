package com.nptel.week2;

/**
 * To call print() method of class Question by creating a method named
 * ‘studentMethod()’.
 * 
 * @author VivekVineeth
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		// Object of the main class is created
		Exercise3 q = new Exercise3();
		// Print method on object of Question class is called
		q.studentMethod();
	}

	// 'print()' method is defined in class Question
	void print(Exercise3 object) {
		System.out.print("Well Done!");
	}

	// Define a method named 'studentMethod()' in class Question
	void studentMethod() {
		print(this);
	}
	// Call the method named 'print()' in class Question

}
