package myPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void test() {
		Addition addition = new Addition();
		
		
		int a = 1; 
		int	b = 2; 
		int	result = addition.calculate(a,b);
		
		assertEquals(3, result);
		
		System.out.print("Hallo!");
	}
	
	@Test
	public void testCalcultation() throws Exception {
		Addition addition = new Addition();
	
		int test_result = addition.calculate(2, 4);
		
		assertEquals(6, test_result);
	}

}
