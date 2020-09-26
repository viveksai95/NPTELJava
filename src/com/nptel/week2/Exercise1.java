package com.nptel.week2;

/**
 * JAVA OOP Concepts Practice
 * @author VivekVineeth
 *
 */

class School {
	// This is a method in class School
	public void print() {
		System.out.println("Hi! I class SCHOOL.");
	}
}

// This is the class named Student
class Student {
	// This is a method in class Student
	public void print() {
		System.out.println("Hi! I am class STUDENT");
	}
}

public class Exercise1 {

	public static void main(String[] args) {
		// Create an object of class Student
		Student student = new Student();

		// Call 'print()' method of class Student
		student.print();

		// Create an object of class School
		School school = new School();

		// Call 'print()' method of class School
		school.print();
	}

}
