package com.Main.programming;

import org.testng.annotations.Test;

public class ClassPrintwithoutUsingForloop {
	
	@Test
	public static void name() {
		
		MethodUF(100);
	}
	
	//static int num=100;
	@Test
	public static void MethodUF(int num) {
		
		if(num>0)
		{
			
			//num++;
			
			MethodUF(num-1);
			System.out.println(num+"");
		}
		
	}

}
