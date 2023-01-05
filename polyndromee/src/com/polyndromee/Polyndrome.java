package com.polyndromee;
import java.util.*;

public class Polyndrome {

	public static void main(String[] args)
	{
		try
		{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number ");
		int n = in.nextInt();
		     int sum = 0, r;
			 int temp = n;    
		     while(n>0)
			   {    
		        r = n % 10;   
		        sum = (sum*10)+r;    
		        n = n/10;    
		       }    
		      if(temp==sum)    
		        System.out.println("It is a Palindrome number.");    
		      else    
		        System.out.println("Not a palindrome"); 
		}
		catch(Exception e)
		{
			System.out.println("Number is not entered");
		}
    }  
}
