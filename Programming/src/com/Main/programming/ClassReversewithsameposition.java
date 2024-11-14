package com.Main.programming;

import org.testng.annotations.Test;

public class ClassReversewithsameposition {
	
	
	@Test
	public static void Rev() {
		
		
		String str="This is Vijaykumar";
		
		String[] strv=str.split(" ");
		
		String reverse=" ";
		
		for(int i=0;i<strv.length;i++)
		{
			if(i==strv.length)
			{
				reverse=strv[i]+reverse;
			}
			else
			{
				reverse=" "+strv[i]+reverse;
			}
		}
		
		System.out.println(reverse);
	}

}
