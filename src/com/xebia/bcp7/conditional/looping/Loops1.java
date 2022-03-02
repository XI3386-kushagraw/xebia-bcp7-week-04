/**
 * 
 */
package com.xebia.bcp7.conditional.looping;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class Loops1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++) {
			System.out.println(i);
		}

		System.out.println("/////////////////////////////////////////////");
		
		int i=0;
		while(i<4) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("/////////////////////////////////////////////");
		
		int ar[]= {1,2,3,4};
		
		for(int a:ar) {
			System.out.println(a);
		}
		

		System.out.println("/////////////////////////////////////////////");
		
		i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<4);
		

		System.out.println("/////////////////////////////////////////////");
		
	}

}
