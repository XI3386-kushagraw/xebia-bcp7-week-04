/**
 * 
 */
package com.xebia.bcp7.operators;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class ShiftOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte x,y;
		x=10;
		y=-10;
		
		//Shifting with taking care of the sign bit
		System.out.println("x>>2 is :- "+(x>>2));
		System.out.println("x<<2 is :- "+(x<<2));
		
		//Shifting the digits including the sign bit
		System.out.println("x>>>2 is :- "+(x>>>2));
		System.out.println("y>>>2 is :- "+(y>>>2));
	}

}
