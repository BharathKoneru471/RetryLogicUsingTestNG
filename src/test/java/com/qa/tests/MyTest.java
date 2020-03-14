package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	//here are defining two test cases
	//they are getting failed and we are not providing a chance again for these failure test cases to execute again.
	
	
	//Defining the Retry logic at the Test level:
	
	/*retryAnalyzer() is a method of Test class whose return type is Class name
	 * we are informing the TestNG, where exactly the retry logic is present 
	 */
	//@Test(retryAnalyzer = Analyzer.RetryAnalyzer.class )
	@Test
	public void Test1() {
	                      //actual,expected
		Assert.assertEquals(true, true);
		
	}
	@Test
	public void Test2() {
		Assert.assertEquals(true, true);
	}
	@Test
	public void Test3() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test4() {
		Assert.assertEquals(true, true);
	}

}
