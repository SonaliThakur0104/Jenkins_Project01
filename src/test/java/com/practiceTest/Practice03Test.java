package com.practiceTest;

import org.testng.annotations.Test;

public class Practice03Test {
	public String browser;
	@Test
	public void practiceTest() {
		System.out.println("practice test");
		browser=System.getProperty("Browser");
	}

}
