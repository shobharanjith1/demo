package Assign1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class i4 implements IRetryAnalyzer{

	int c=0;
	int max_c=3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(c<max_c)
			c++;
		return false;
	}

}
