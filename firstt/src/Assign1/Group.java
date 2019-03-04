package Assign1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
	@Test(groups="smoke")
	public void d1() {
		Reporter.log("testing",true);
	}
	
	@Test(groups="regression")
	public void d2()
	{
		Reporter.log("regression",true);
	}
}
