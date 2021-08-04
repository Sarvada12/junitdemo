package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Business.Calculater;

public class CalculaterTest {

	
	//craete object of aclass to be tested 
	private Calculater calc;
	
	@Before
	public void setUp() throws Exception {
		calc =new Calculater();
	}

	@After
	public void tearDown() throws Exception {
	calc=null;
	}

	@Test
	public void testAdd() {
	//	fail("Not yet implemented");
	
	double result =calc.add(10.50,10.35);
	assertEquals(20.85, result,0);
	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		double result =calc.subtract(100.50,10);
		assertEquals(90.50, result,0);

	}

	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		double result =calc.multiply(100.50,10);
		assertEquals(1005.00, result,0);

	
	}

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		double result =calc.divide(100.50,10);
		assertEquals(10.05, result,0);

	
	}
	@Test(expected=ArithmeticException.class)
	public void testdividebyzero()
	{
		calc.divide(200,0);
	}

}
