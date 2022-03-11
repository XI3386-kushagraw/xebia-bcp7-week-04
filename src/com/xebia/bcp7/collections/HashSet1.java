/**
 * 
 */
package com.xebia.bcp7.collections;

import java.util.*;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class HashSet1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet();  
		set.add("One");    
		set.add("Two");    
		set.add("Three");   
		set.add("Four");  
		set.add("Five");  
		Iterator<String> i=set.iterator();  
		while(i.hasNext())  
		{  
			System.out.println(i.next());  
		}  

	}

}
