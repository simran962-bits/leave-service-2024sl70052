package com.bits.leave;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class LeaveCalculatorTest {
	LeaveCalculator calc = new LeaveCalculator();
	@Test
	public void validateLeaveBalance(){
		assertEquals(15, calc.calculatedLeaveBalance(20,5));
	}

	@Test
	public void validEncashment(){
		assertEquals(15000.0, calc.calculateEncashment(20,5,1000.0),0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void invalidUsedLeaves(){
		calc.calculatedLeaveBalance(20,25);
	}
}
