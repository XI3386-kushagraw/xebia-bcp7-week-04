/**
 * 
 */
package com.xebia.bcp7.thread;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class Thread1 extends Thread{

	public void run() {
		System.out.println("Hello the threa is running by extending the thread class");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1=new Thread1();
		t1.start();
	}

}
