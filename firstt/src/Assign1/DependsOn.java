package Assign1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn {
	@Test(dependsOnMethods="test2")
	public void test1()
	{
		Reporter.log("selenium",true);
		Assert.fail();
		
	}
	@Test
	public void test2()
	{
		Reporter.log("java",true);
	}
	@Test(dependsOnMethods="test2")
	public void test3()
	{
		Assert.fail();
		Reporter.log("programing",true);
	}

}
