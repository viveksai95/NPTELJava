package com.nptel.obj.week2;

/**
 * Should learn naming the variables as per the flow for which they are being
 * utilised
 * 
 * @author VivekVineeth
 *
 */
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] copyFrom = {'j', 'a', 'n', 'j', 'a', 'v', 'a', 'n', 'p', 't', 'e', 'l'};
		char[] copyTo = new char[9];
		
		System.arraycopy(copyFrom, 3, copyTo, 0, 9);
		System.out.println(new String(copyTo));
		
		boolean f = Integer.valueOf(1).equals(Long.valueOf(1));
		System.out.println(f);
		
//		for(String s: args){
//			System.out.println(s);
//		}
	}
	
}
