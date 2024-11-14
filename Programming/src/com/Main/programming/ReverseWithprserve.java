package com.Main.programming;

import org.testng.annotations.Test;

public class ReverseWithprserve {
	
	@Test
	public static void Pr() {
		
		String str="This is Vijaykumar";
		
		char[] cValue=str.toCharArray();
		char[] cSValue=new char[cValue.length];
		
		for(int i=0;i<cValue.length;i++)
		{
			if(cValue[i]==' ')
			{
				cSValue[i]=' ';
			}
		}
		
		
	int j=	cSValue.length-1;
		for(int i=0;i<cSValue.length;i++)
		{
			if(cValue[i]!=' ')
			{
				if(cSValue[j]==' ')
				{
					j--;
				}
				
			
			
			cSValue[j]=cValue[i];
			j--;
			}
		}
		System.out.println(String.valueOf(cSValue));
	}

}
