/**
 * 
 */
package com.xebia.bcp7.thread;

/**
 * @author Kushagra.Wadhwa
 *
 */

class Table{  
	synchronized void printTable(int n){//synchronized method  
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){System.out.println(e);}  
		}  

	}  
}  

class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  

}  
class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  
public class Thread1 extends Thread{

	public void run() {
		System.out.println("Hello the threa is running by extending the thread class");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t=new Thread1();
		t.start();
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  

	}

}
