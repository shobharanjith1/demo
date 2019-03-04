package Assign1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsser {
	@Test
	public void s1() {
		String ex="www.gmail.com";
		String ac="www.gmail.com";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(ac, ex);
		s.assertAll();
		
		
	}
}
