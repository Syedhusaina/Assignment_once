package com.overloading;

public class Sum_Numbers{
	
	public int sum(int x, int y)
	{ 
		return (x + y);
	}
	
	 public int sum(int x, int y, int z)
	 {
		 
		 return (x + y + z);
	 }
	 public double sum(double x, double y)
	 {
		 return (x + y);
	 }
	 public static void main(String args[])
	 {
		 Sum_Numbers s= new Sum_Numbers();
		 System.out.println("Sum of numbers is=="+s.sum(10,20));
		 System.out.println("Sum of numbers with 3 variables is=="+s.sum(10, 20, 30));
		 System.out.println("Sum of numbers with vlues is"+s.sum(10.5, 20.5));
}
}

