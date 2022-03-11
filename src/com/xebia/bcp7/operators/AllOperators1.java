/**
 * 
 */
package com.xebia.bcp7.operators;

import java.util.Scanner;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class AllOperators1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//Addition
		System.out.println(a+b);
		
		//Multiplication
		System.out.println(a*b);
		
		//Division
		System.out.println(a/b);
		
		//Subtraction
		System.out.println(a-b);
		
		//Conditional Operator
		System.out.println((a>b)?"a is greater":"b is greater");
	}

}
