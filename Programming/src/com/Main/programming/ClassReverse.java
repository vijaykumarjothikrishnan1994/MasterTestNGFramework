package com.Main.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ClassReverse {
	
	
	
	
	@Test
	public static void name() {
		List<Character> l=new ArrayList<Character>();
		
		String str="VijayKumar";
		int i;
		char[] cValue=str.toCharArray();
		for( i=cValue.length-1;i>=0;i--)
		{
			//System.out.println(cValue[i]);
			//l.add(cValue[i]);
			
			l.add(cValue[i]);
			
		}
		
		
		/*
		 * for(Object e:l ) {
		 * 
		 * //System.out.print(e);
		 * 
		 * String ValueofRev= String.valueOf(e);
		 * 
		 * //ValueofRev.split(str)
		 * 
		 * //System.out.println(e);
		 * 
		 * Collections.reverse(l);
		 * 
		 * System.out.println(l); }
		 */
		
		for(Character e:l)
		{System.out.println(l);
		
		break;
			
		}
		
	}
	

}
