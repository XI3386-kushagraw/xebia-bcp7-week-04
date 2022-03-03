/**
 * 
 */
package com.xebia.bcp7.iostream;

import java.io.*;
import java.util.Scanner;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class InputOutputMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//Taking input using buffered reader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		System.out.println(name);
		
		
		
		//Taking input using Scanner Class
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		sc.close();
		

		
		//Taking input through console
		String n = System.console().readLine();
		System.out.println(n);
	}

}
