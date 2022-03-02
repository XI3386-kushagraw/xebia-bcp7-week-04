/**
 * 
 */
package com.xebia.bcp7.iostream;

import java.io.*;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class FileOS1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fs=null;
		
		try {
			fs=new FileOutputStream("D:\\hello.txt");
			String s = "My name is Kushagra Wadhwa";
			byte b[] = s.getBytes();
			fs.write(b);
			fs.close();
			System.out.println("Written on file");
		}catch(Exception e) {
			System.out.println("Exception handeled "+e);
		}
		
	}

}
