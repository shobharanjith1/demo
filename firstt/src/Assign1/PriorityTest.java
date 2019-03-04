package Assign1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test
	public void test2()
	{
		Reporter.log("price",true);
	}
	@Test(priority=1)
	public void test1()
	{
		Reporter.log("lenovo",true);
	}
	@Test(priority=0,invocationCount=2)
	public void test3()
	{
		Reporter.log("color",true);
	}
}
