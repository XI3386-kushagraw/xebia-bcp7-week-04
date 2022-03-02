/**
 * 
 */
package com.xebia.bcp7.collections;

import java.util.*;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class Set1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
