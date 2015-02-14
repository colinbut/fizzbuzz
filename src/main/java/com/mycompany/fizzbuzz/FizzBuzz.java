/**
 * 
 */
package com.mycompany.fizzbuzz;

/**
 * The ever classic FizzBuzz problem
 * 
 * @author Colin
 *
 */
public class FizzBuzz {

	/**
	 * Simple fizzbuzz version
	 */
	public static void fizzBuzzV1(){
		
		for(int i = 1; i <= 100; i++)
		{
		
			if((i % 3 == 0) && (i % 5 == 0)){
				System.out.println("FizzBuzz " + i);
			}
			else if((i % 3) == 0){
				System.out.println("Fizz " + i);
			}
			else if((i % 5) == 0){
				System.out.println("Buzz " + i);
			}
			
		}
	}
	
	/**
	 * Another version of fizzbuzz
	 */
	public static void fizzBuzzV2(){
		
		for(int i = 1; i <= 100; i++)
		{
			if((i % 15) == 0){
				System.out.println("FizzBuzz " + i);
			}
			else if((i % 3) == 0){
				System.out.println("Fizz " + i);
			}
			else if((i % 5) == 0){
				System.out.println("Buzz " + i);
			}
		}

	}
	
	/**
	 * @param args program arguments
	 */
	public static void main(String[] args) {
		
		fizzBuzzV1();
		
		fizzBuzzV2();
	}

}
