package Assign1;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount=0)
	public void t1()
	{
		Reporter.log("just ignore",true);
	}
	@Test
	public void t2() {
		Reporter.log("say hi",true);
	}
	@Ignore
	public void t3() {
		Reporter.log("how do you do",true);
	}
	@Test(enabled=false)
	public void t4()
	{
		Reporter.log("ignored",true);
		}
}
