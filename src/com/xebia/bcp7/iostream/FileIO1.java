/**
 * 
 */
package com.xebia.bcp7.iostream;

import java.io.*;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class FileIO1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream in=null;
		try {
			in=new FileInputStream("C:\\Users\\Kushagra.Wadhwa\\Documents\\hello.txt");
			int i = in.read();
			System.out.println((char)i);
		}
		catch(Exception e){
			System.out.println("Exception handled "+e);
		}
		finally {
			System.out.println("Finally block is executed");
		}
		
	}

}
