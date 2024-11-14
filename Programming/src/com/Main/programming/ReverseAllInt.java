package com.Main.programming;

import java.util.Iterator;

public class ReverseAllInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="lal";
		String revserve="";
		
		for (int i=str.length()-1;i>=0;i--) {
			
			revserve=revserve+str.charAt(i);
			
			
			
		}
		if(str.equals(revserve))
		{
			
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
		
	}

}
