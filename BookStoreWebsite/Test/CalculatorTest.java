
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int a = 12;
		int b = 56;
		int result = calculator.add(a, b);
		int expected = 68;
		assertEquals(expected,result);
	}

}
