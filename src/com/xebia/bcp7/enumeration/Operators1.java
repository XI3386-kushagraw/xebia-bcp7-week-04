/**
 * 
 */
package com.xebia.bcp7.enumeration;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class Operators1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5,b=10,c=5,d=-10;
		
		//Addition
		System.out.println(a+b);

		//Subtraction
		System.out.println(a-b);
		
		//Multiplication
		System.out.println(a*b);

		//Division
		System.out.println(a/b);
		
		//Left Shift
		System.out.println(a<<2);
		
		//Right Shift
		System.out.println(a>>2);
		
		//Right Shift without most significant bit
		System.out.println(d>>>2);
		
		//Conditional operator
		System.out.println((a==c)?a:b);
	}

}
