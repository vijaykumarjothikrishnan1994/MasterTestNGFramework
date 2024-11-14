package com.Main.programming;

public class PalindormeArraySting {
	
	public static void PalindromeArray() {
		
		
		String[] s=new String[] {"jfkd","Vijay","lal","hfhsdfjsdf"};
		int j = 0;
		for(int i=0;i<s.length;i++)
		{
			for( j=s.length-1;j>0;j--)
			{
				--j;
				//System.out.println(s[j]);
			}
			
			System.out.println(s[j]);
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeArray();

	}

}
