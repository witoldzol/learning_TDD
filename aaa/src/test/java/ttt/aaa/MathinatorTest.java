package ttt.aaa;

import org.junit.Assert;

import org.junit.Test;

public class MathinatorTest {

	Mathinator classInTest;

	public MathinatorTest() {
		classInTest = new Mathinator();
	}

	int sum = 11;

	// 8+3 = 11
	@Test
	public void eightPlusThreeisEleven() {
		Assert.assertEquals(sum, classInTest.add(8, 3));

	}
	@Test
	// 8 -3 is 5
	public void eightMinusThreeIsFive() {	
		Assert.assertEquals(5, classInTest.sub(8, 3));
	}
}
