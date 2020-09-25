package com.nptel.week1;

import java.util.Scanner;

/**
 * To find the largest among three numbers x, y, and z You should use
 * if-then-else construct in Java.
 * 
 * @author VivekVineeth
 *
 */

public class Exercise2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		int result = 0;

		if (x >= y && x >= z) {
			result = x;
		} else if (y >= x && y >= z) {
			result = y;
		} else if (z >= x && z >= y) {
			result = z;
		}

		System.out.print(result);
		s.close();

	}

}
