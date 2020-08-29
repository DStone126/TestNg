package com.syntax.class1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task {

	@BeforeMethod
	public void before() {
		System.out.println("Before Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test One");
	}
	
	@Test
	public void test2() {
		System.out.println("Test Two");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void  beforeClass() {
		System.out.println("----- This is before class annotation -----");
		}
	
	@AfterClass
	public void afterClass() {
		System.out.println("----- This is after class annotation ------");
	}
	
	
	
	
	
	
	
	
	
}
