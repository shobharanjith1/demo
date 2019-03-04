package Assign1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngMethod {
	@AfterClass
	public void afterClass()
	{
		Reporter.log("thanks",true);
	}
	@BeforeMethod
	public void before()
	{
		Reporter.log("welcome",true);
	}
	@Test
	public void t1()
	{
		Reporter.log("say hi", true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("greeting",true);
	}
	
	@AfterMethod
	public void after()
	{
		Reporter.log("bye",true);
	}

}
