package com.nptel.week2;

/**
 * To call default constructor first and then any other constructor in the
 * class.
 * 
 * @author VivekVineeth
 *
 */
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Answer a = new Answer(10, "MCQ");
	}

}

class Answer {
	Answer() {
		System.out.println("You got nothing.");
	}

	Answer(int marks, String type) {
		this();// this() doesn't work if no default constructor is defined
		System.out.println("You got " + marks + " for an " + type);
		// this();//Constructor call must be the first statement in a constructor
	}
}
