package Assign1;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Assign1.i2.class)
public class i12 {
	@Test
	public void t1() {
		Reporter.log("good morning",true);
	}
	@BeforeMethod
	public void b1() {
		System.err.println("at 6am");
	}

}
