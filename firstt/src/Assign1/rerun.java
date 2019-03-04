package Assign1;


import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class rerun {
@Test
public void run() {
	TestNG t=new TestNG();
	List<String>  l=new ArrayList<>();
	l.add("C:\\Users\\Shobha\\git\\demo2\\firstt\\Asser2.xml");
	t.setTestSuites(l);
	t.run();
	
}
}
