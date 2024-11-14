package com.Main.programming;

import org.testng.annotations.Test;

public class FindVowals {
	
	@Test
	public static void Vow() {
		
		String str="ThisisVijaykumar";
		
		char[] cValue=str.toCharArray();
		
		for(int i=0;i<cValue.length;i++)
		{ 
			int increment=1;
			if(cValue[i]=='a'||cValue[i]=='i'||cValue[i]=='o'||cValue[i]=='u')	
			{
				
				
				System.out.println("This is Vowel : "+cValue[i]+" And Thier count is : "+increment);
				
				
				increment++;
				
				
			}
			
			else
			{
				
				System.out.println("This is not Vowel : "+cValue[i]);
				increment++;
				
			}
			
			
			
		}
		
		
	}

}
