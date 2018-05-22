package jenkins;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test1 {
	
	
	@Test
	public void testPro1() {
		
		int a = 3;
		int b = 2;
		assertTrue(a+b == 5);
		
	}

	@Test
	public void testPro2() {
		
		int a = 3;
		int b = 3;
		assertTrue(a+b == 6);
		
	}
	
	@Test
	public void testPro3() {
		
		int a = 4;
		int b = 3;
		assertTrue(a+b == 7);
		
	}

}
