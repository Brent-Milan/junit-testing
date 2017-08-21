package makoto.walkthrough;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
	
	private Application classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Application();
	}
	

	@Test
	public void testAdd() {
		long result = 10 + 23 + (-1) + 16;
		
		//compare
		assertEquals(result, classUnderTest.add(10, 23, (-1), 16));
		
		result = 100 + 102;
		
		//compare
		assertEquals(result, classUnderTest.add(100, 102));
		
		result = 0;
		
		//compare
		assertEquals(result, classUnderTest.add(0));
	}	
	
	
	
	
	
	@Test
	public void testSubtract() {
		
		long result = 99 - 98;
		
		//compare
		assertEquals(result, classUnderTest.subtract(99, 98));
		
		result =  10 - 9 - 1;
		
		//compare
		assertEquals(result, classUnderTest.subtract(10, 9, 1));
		
		result = 1000 - 50 - 900;
		
		//compare
		assertEquals(result, classUnderTest.subtract(1000, 50, 900));
		
		result = 0;
		
		//compare
		assertEquals(result, classUnderTest.subtract(0));
	}
	
	@Test
	public void testMultiply() {
		long result = 10 * 10;
		
		//compare
		assertEquals(result, classUnderTest.multiply(10, 10));
		
		result = 1 * 11 * 200 * 0;
		
		//compare
		assertEquals(result, classUnderTest.multiply(1, 11, 200, 0));
		
		result = 0;
		
		//compare
		assertEquals(result, classUnderTest.multiply(0));
	}
	
	@Test
	public void testDivide() {
		
		long result = 10/10;
		
		//compare
		assertEquals(result, classUnderTest.divide(10, 10));
	}

}
