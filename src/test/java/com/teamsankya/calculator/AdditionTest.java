package com.teamsankya.calculator;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class AdditionTest {
	@SuppressWarnings("static-access")
	@Test
	public void addIntTest() {
		int sum=Addition.add(20,30);
		TestCase.assertEquals(50, sum);
	}

}
