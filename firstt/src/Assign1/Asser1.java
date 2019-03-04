package Assign1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Asser1 {
	@Test
	public void t1()
	{
		String ex ="abc";
		String ac="abc";
		Assert.assertEquals(ac, ex);
		Reporter.log("success",true);
	}
}
