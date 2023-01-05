package com.throwsexcep;
import java.util.Scanner;

public class Throw_Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner s = new Scanner(System.in);
		        System.out.println("Please enter the number=");
		        int num = s.nextInt();

		        try {
		            if (num% 2==0) {
		                throw new Exception("The number enteed is even");
		            } else {
		                System.out.println("Number is odd");
		            }
		        } catch (Exception e) {
		            System.out.println("An exception is thrown");
		            System.out.println(e.getMessage());
		        }
		    }
	

	}

