package Assign1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnG {
	@Test(dependsOnGroups="p1")
	public void exam()
	{
		Reporter.log("exam ", true);
	}
	@Test(groups="p1")
	public void preparation()
	{	
		Assert.fail();
		Reporter.log("reading",true);
		}
}
