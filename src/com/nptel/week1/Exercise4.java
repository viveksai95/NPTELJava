package com.nptel.week1;

import java.util.Scanner;

/**
 * To calculate the Given input is Armstrong Number or not
 * 
 * @author VivekVineeth
 *
 */
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		//I have used 2 extra variables to complete the execution.
		//Is there any enhanced method for space optimization.
		int sum = 0;
		int n2 = n;
		//Surfed the net. Found the same approach.

		while (n2 > 0) {
			int digit = n2 % 10;
			sum += Math.pow(digit, 3);
			n2 /= 10;
		}

		if (sum == n)
			result = 1;

		System.out.print(result);
		sc.close();

	}

}
