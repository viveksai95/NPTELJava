package com.nptel.week1;

import java.util.Scanner;

/**
 * Consider first n even numbers starting from zero(0) Calculate sum of all
 * these numbers divisible by 3 . Print the sum.
 * 
 * @author VivekVineeth
 *
 */

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		//Do the below operation using while loop as well;
		for (int i = 0; i < n; i++) {
			if ((i * 2) % 3 == 0) {
				sum += (i * 2);
			}
		}

		System.out.print(sum);
		sc.close();

	}

}
