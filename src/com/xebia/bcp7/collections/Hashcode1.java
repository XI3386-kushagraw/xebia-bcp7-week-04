/**
 * 
 */
package com.xebia.bcp7.collections;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class Hashcode1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello World";
		String b="hello";
		String c="Hello World";
		
		if(a.equals(c)) {
			System.out.println(a.hashCode()+" "+c.hashCode());
		}
		
		if(!a.equals(b)) {
			System.out.println(a.hashCode()+" "+b.hashCode());
		}


	}

}
