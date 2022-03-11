/**
 * 
 */
package com.xebia.bcp7.iostream;
import java.io.*;
/**
 * @author Kushagra.Wadhwa
 *
 */
public class BufferedOutputStreamEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout=new FileOutputStream("C:\\\\Users\\\\Kushagra.Wadhwa\\\\Documents\\\\hello.txt");    
			BufferedOutputStream bout=new BufferedOutputStream(fout);    
			String s="Welcome to javaTpoint.";    
			byte b[]=s.getBytes();    
			bout.write(b);    
			bout.flush();    
			bout.close();    
			fout.close();    
			System.out.println("success");  
		}catch(Exception e) {
			System.out.println("Exception handelled");
		}
	}

}
