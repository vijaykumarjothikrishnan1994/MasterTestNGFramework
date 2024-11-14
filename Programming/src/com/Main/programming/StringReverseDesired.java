package com.Main.programming;

import org.testng.annotations.Test;

public class StringReverseDesired {

	
	@Test
	public static void S1() {
		
		
		String str="This is Vijaykumar";
		
		String[] strv= str.split(" ");
		String result=" ";
		
		for(int i=0;i<strv.length;i++)
		{
			if(i==strv.length-1)
			{
				result=strv[i]+result;
				
			//	System.out.println(result);
			}
			
			else
			{
				result=" "+strv[i]+result;
				//System.out.println(result);
			}
			
			//System.out.println(result);
		}
		System.out.println(result);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println(StringReverseDesired.S1());
	}

}
