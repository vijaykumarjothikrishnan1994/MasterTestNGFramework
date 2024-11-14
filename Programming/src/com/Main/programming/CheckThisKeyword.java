package com.Main.programming;

public class CheckThisKeyword {

	 int i;
	
	public  void Method1(int i) {
		
		i=i;
		this.i=i;
		Method2();
		System.out.println(i);
	}
	
public  void Method2() {
	
	System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CheckThisKeyword c=new CheckThisKeyword();	
		
		c.Method1(12);

	}

}
