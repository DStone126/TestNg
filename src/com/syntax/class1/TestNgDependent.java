package com.syntax.class1;

import org.testng.annotations.Test;

public class TestNgDependent {

	@Test
	public void login() {
		System.out.println("Test that logges into the application");
	}

	@Test(dependsOnMethods = "login")
	public void checkReport() {
		System.out.println("Test that checks report");
	}





}
