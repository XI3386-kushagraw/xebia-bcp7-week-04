/**
 * 
 */
package com.xebia.bcp7.collections;

import java.util.*;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class List1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(8);
		
		Iterator<Integer> it=al.iterator();
		
		for(int i=0;i<al.size();i++) {
			System.out.println(it.next());
		}
		
	}

}
