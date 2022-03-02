/**
 * 
 */
package com.xebia.bcp7.enumeration;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class Enum1 {

	/**
	 * @param args
	 */
	
	enum weekday{
		Saturday,Sunday,Monday;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(weekday q:weekday.values()) {
			System.out.println(q);
		}
	}

}
