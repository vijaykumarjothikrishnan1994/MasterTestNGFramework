package com.Main.programming;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTestNG {
	
	@Test
	public void method1() {
		
		System.out.println("This is method 1");
		
	}
	@Test
public void method2() {
		
		System.out.println("This is method 2");
		
	}
	
	@BeforeMethod
public void Beforemethod() {
	
	System.out.println("This is  Before method ");
	
}
	
	@AfterMethod
public void Aftermethod() {
	
	System.out.println("This is After method ");
	
}

	@BeforeTest
public void BeforeTestmethod1() {
	
	System.out.println("This is Before Test method ");
	
}
	
	@AfterTest
public void AfterTestmethod() {
	
	System.out.println("This is After Test method ");
	
}
	@Test(priority = -1)
	public void Thisismethod() {
		
		System.out.println("This is priority -1");
		
	}

	@Test(priority = -1)
	public void AThisismethod() {
		
		System.out.println("This is priority -1(A)");
		
	}
	@Test(priority = -5)
	public void AThisismethodwithminusfive() {
		
		System.out.println("This is priority -1(A)(-5)");
		
	}
	@BeforeClass
	public void BeforeCLass() {
		
		System.out.println("This is BeforeCLass)");
		
	}
	@AfterClass
	public void Afterclass() {
		
		System.out.println("This is After class");
		
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		
		System.out.println("This is Beforesuite)");
		
	}
	
	
	@AfterSuite
	public void AfterSuite() {
		
		System.out.println("This is AfterSuite");
		
	}
}
