package com.nptel.week2;

//This is the class named Printer
class Printer {
	// This are the methods in class Printer
	public void print() {
		System.out.println("Hi! I class SCHOOL.");
	}

	public void print(String s) {
		System.out.println(s);
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();

		printer.print("Hi! I am class STUDENT");
		printer.print();
	}

}
