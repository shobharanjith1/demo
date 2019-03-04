package Assign1;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Assign1.i3.class)
public class i13 {
	@Test
	public void a1() {
		System.out.println("java ");
	}
	@Test
	public void a2() {
		System.out.println("selenium");
	}
	
	@AfterMethod
	public void aftr(ITestResult r) {
		boolean b = r.isSuccess();
		System.out.println(b);
		String n = r.getName();
		System.out.println(n);
		int s = r.getStatus();
		System.out.println(s);
		
		
	String c = r.getInstanceName();
		System.out.println(c);
		
	}
}
