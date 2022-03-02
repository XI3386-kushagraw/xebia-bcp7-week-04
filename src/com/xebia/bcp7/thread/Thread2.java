/**
 * 
 */
package com.xebia.bcp7.thread;

/**
 * @author Kushagra.Wadhwa
 *
 */
public class Thread2 implements Runnable {

	/**
	 * @param args
	 */
	
	public void run() {
		System.out.println("Hello implementing the runnable interface");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread2 t=new Thread2();
		Thread t2=new Thread(t);
		t2.start();
		System.out.println("This code is outside the thread class");
	}

}
