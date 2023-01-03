package com.exception;

public class Exception 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Number given ");
			int num=45/0;  
			System.out.println(num);
		}  
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is occured");
		}
		finally
		{
			System.out.println("Number can't be divisible by 0");
		}
		System.out.println("Out of try-catch-finally block");
	}
}


	