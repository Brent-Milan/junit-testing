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
		assertEquals(result, classUnderTest.add(10, 23, -1, 16));
		
		result = 100 + 102;
		
		//compare
		assertEquals(result, classUnderTest.add(100, 102));
		
		result = 0;
		
		//compare
		assertEquals(result, classUnderTest.add(0));
	}	
	
	
	
	
	
	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

}
