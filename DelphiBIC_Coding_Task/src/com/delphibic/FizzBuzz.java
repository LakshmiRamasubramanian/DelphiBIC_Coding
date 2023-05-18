package com.delphibic;

import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) throws InputMismatchException, Exception{
		Scanner getInputfromUser = new Scanner(System.in);
		try {
			System.out.println("******FizzBuzz start*******");
			System.out.println("Please Enter the Start Number");
			int startRange = getInputfromUser.nextInt();
			System.out.println("Please Enter the End Number");
			int endRange = getInputfromUser.nextInt();
			fizzBuzzLogic(startRange, endRange);
		}
		catch (InputMismatchException inputMismatchException) {
			System.out.println(" InputMismatchException occured : " + inputMismatchException.getMessage());
		} 
		catch (Exception exception) {
			System.out.println(" Exception occured : " + exception.getMessage());
		} 
		finally {
			getInputfromUser.close();
			System.out.println("******FizzBuzz END*******");
		}
	}

	protected static void fizzBuzzLogic(int startRange, int endRange) throws Exception {

		System.out.println("Entering into FizzBuzzLogic Methods");
		try {
			for (int counter = startRange; counter <= endRange; counter++) {
				if ((counter % 15==0)) {
					System.out.println("FizzBuzz");
				} else if (counter % 5 == 0) {
					System.out.println("Buzz");
				} else if (counter % 3 == 0) {
					System.out.println("Fizz");
				} else {
					System.out.println(counter);
				}
			}
		} 
		catch (Exception exception) {
			System.out.println(" Exception occurerd : " + exception.getMessage());
		} 
		finally {
			System.out.println("******Exit from FizzBuzz Logic*******");
		}

	}

}
