package com.teamsankya.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class DivisionTest {
	@Ignore
	@SuppressWarnings("static-access")
	@Test
	public void addIntTest() {
		int sum=Division.div(15, 5);
		TestCase.assertEquals(30, sum);
		System.out.println("this is first test....");
	}
	@SuppressWarnings("static-access")
	@Test
	public void addInt() {
		int sum=Division.div(5, 5);
		TestCase.assertEquals(1, sum);
		System.out.println("this is second test....");
	}
	
	
	@Before
	@SuppressWarnings("static-access")
	public void addIntTest1() {
		System.out.println("before test case");

		/*int sum=Division.div(15, 5);
		TestCase.assertEquals(3, sum);*/
	}
@After
	@SuppressWarnings("static-access")
	public void addIntTest2() {
		/*int sum=Division.div(50, 5);
		TestCase.assertEquals(39, sum);*/
	System.out.println("after test case");
	}
@BeforeClass
	@SuppressWarnings("static-access")
	public static void  addIntTest3() {
	System.out.println("before the class");
		/*int sum=Division.div(100, 5);
		TestCase.assertEquals(39, sum);*/
	}
@AfterClass
	@SuppressWarnings("static-access")
	public static void addIntTest4() {
	System.out.println("after the class");
		/*int sum=Division.div(150, 5);
		TestCase.assertEquals(39, sum);*/	
}



	
}
