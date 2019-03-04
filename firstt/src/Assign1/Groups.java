package Assign1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups {
	@Test(groups="test1")
	public void t1()
	{
		Reporter.log("hiii",true);
	}
	
	@Test(groups="test2")
	public void t2() {
		Assert.fail();
		Reporter.log("hello",true);
	}
}
