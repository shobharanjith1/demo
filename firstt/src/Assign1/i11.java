package Assign1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Assign1.l1.class)
public class i11 {
	
	@Test
	public void s1() {
		Reporter.log("say hi",true);
	}
	@Test
	public void s2() {
		Assert.fail();
		Reporter.log("say hello",true);
	}
}
