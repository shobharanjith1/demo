package Assign1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asser2 {
@Test
public void test1() {
	Set<String> s=new HashSet<>();
	Collections.addAll(s, "abc","xyz");
	Set<String> s1=new HashSet<>();
	Collections.addAll(s1, "abc","xyz");
	
	Assert.assertNotEqualsDeep(s, s1, "working");
	
	Assert.assertTrue(true);
}
}
