package com.Main.programming;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ListwithArrayList {
	
	
	@Test
	public static void name() {
		
		
		List< Character> l=new ArrayList<Character>();
		
		l.add('y');
		l.add('z');
		l.add('c');
		l.add('a');
		
		
		for (Character character : l) {
			
		System.out.println(character);
			
		}
		
	}
	
	
	

}
