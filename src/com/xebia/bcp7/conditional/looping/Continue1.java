/**
 * 
 */
package com.xebia.bcp7.conditional.looping;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class Continue1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j=3;

		for(int i=0;i<10;i++) {
			if(i==j) {
				continue;
			}
			System.out.println(i);
		}
	}

}
