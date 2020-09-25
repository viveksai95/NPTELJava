package com.nptel.week1;

import java.util.Scanner;

/**
 * Find the highest mark and average mark secured by Hari in "s" number of
 * subjects.
 * 
 * @author VivekVineeth
 *
 */

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double mark_avg;
		int result;
		int i;
		int s;
		// define size of array
		s = input.nextInt();
		// The array is defined "arr" and inserted marks into it of integer type.
		int[] arr = new int[s];

		for (i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		// Initialize maximum element as first element of the array.
		// Traverse array elements to get the current max.
		// Store the highest mark in the variable result.
		// Store average mark in avgMarks.

		mark_avg = 0;
		result = arr[0];

		for (i = 0; i < arr.length; i++) {
			// Finding the Highest Mark Scored
			if (result < arr[i])
				result = arr[i];
			// Sum of all the Marks scored.
			mark_avg += arr[i];
		}

		mark_avg /= s;

		System.out.println(result);
		System.out.print(mark_avg);

		input.close();
	}

}
