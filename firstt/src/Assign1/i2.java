package Assign1;

import org.testng.IClassListener;
import org.testng.ITestClass;

public class i2 implements IClassListener {

	@Override
	public void onBeforeClass(ITestClass testClass) {
		// TODO Auto-generated method stub
		System.out.println("before class");
	}

	@Override
	public void onAfterClass(ITestClass testClass) {
		// TODO Auto-generated method stub
		System.out.println("after class");
	}
}
