package com.Main.programming;

public class RecursiveMethod {

	
	
	public static void ThisISRecursiv(int num) {
		
		if(num<=0) {
			return;
		}
		else
		{
		ThisISRecursiv(num-1);
		
		System.out.println(+num);
		
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisISRecursiv(100);

	}

}
