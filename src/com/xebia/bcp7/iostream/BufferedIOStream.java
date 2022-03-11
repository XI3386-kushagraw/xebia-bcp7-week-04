/**
 * 
 */
package com.xebia.bcp7.iostream;

import java.io.*;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class BufferedIOStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
			FileInputStream fin=new FileInputStream("C:\\\\Users\\\\Kushagra.Wadhwa\\\\Documents\\\\hello.txt");    
			BufferedInputStream bin=new BufferedInputStream(fin);    
			int i;    
			while((i=bin.read())!=-1){    
				System.out.print((char)i);    
			}    
			bin.close();    
			fin.close();    
		}catch(Exception e){System.out.println(e);}    

	}

}
