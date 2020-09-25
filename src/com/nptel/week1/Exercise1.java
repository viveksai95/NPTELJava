package com.nptel.week1;

import java.util.Scanner;

/**
 * To calculate the Area and Perimeter of Circle Given RADIUS as input
 * 
 * @author VivekVineeth
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		double radius = s.nextDouble();
		double perimeter;
		double area;

		if (radius <= 0) {
			// Negative Radius. Returning Back
			System.out.print(" please enter non zero positive number ");
			s.close();// To Stop Resource Leak
			return;
		}

		perimeter = 2 * Math.PI * radius;
		area = Math.PI * radius * radius;

		System.out.println(perimeter);
		System.out.print(area);
		s.close();

	}

}
