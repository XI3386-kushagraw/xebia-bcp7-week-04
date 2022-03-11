/**
 * 
 */
package com.xebia.bcp7.annotations;

/**
 * @author Kushagra.Wadhwa
 *
 */

class Animal{  
	void eatSomething(){
		System.out.println("eating something");
	}  
}  

class Dog extends Animal{  
	@Override  
	void eatSomething(){
		System.out.println("eating foods");
	}//should be eatSomething  
}  



public class Overide1 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();  
		a.eatSomething();  

	}

}
