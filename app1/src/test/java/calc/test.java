package calc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class test {

	@Test
	public void testsum() {
		
		assertEquals(14, calculator.sum(7, 7));
		}
		
	
	@Test
	public void testminus() {
		assertEquals(10, calculator.minus(15, 5));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(200, calculator.Multiply(10, 20));
	}
	
	@Test
	public void testdivide() {
		assertEquals(5, calculator.divide(10, 2));
	}
	
}
