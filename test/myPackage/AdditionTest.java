package myPackage;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class AdditionTest {

	@Test
	public void test() {
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
	
	@Test
	public void testFibonachi()
	{
		Addition addition = new Addition();
		
		int[] result = addition.fibonachi(new int[3]);

		int[] excepted = {1,1,2};
		
		//compare the value
		assertArrayEquals(excepted, result);
		
		//compare length
		assertEquals(excepted.length, result.length);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testFibonachiWithZero() {
		new Addition().fibonachi(new int[0]);
	}
}
