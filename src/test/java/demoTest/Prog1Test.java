package demoTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import demo.Prog1;

import org.testng.AssertJUnit;

public class Prog1Test 
{
	@Test
	public void m1()
	{
		Prog1 p1 = new Prog1();
		AssertJUnit.assertEquals(1, p1.getLogin("Shubham", "abc123"));
	}
	
	
	@Test
	public void m2()
	{
		Prog1 p1=new Prog1();
		AssertJUnit.assertEquals(0, p1.getLogin("lucky", "li213"));
	}
	
	@Test
	@Parameters("para")
	public void m3(String value)
	{
		System.out.println(value);
	}

}
