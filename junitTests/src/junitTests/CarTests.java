package junitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTests {
	@Test
	void CanComputeEconomyImperial() {
		short s1 = 312;
		short s2 = 10;
		float milespergallon =  Car.ComputeEconomy(s1, s2);
		
		assertEquals(31.2f, milespergallon);	
	}
	@Test
	void CanComputeEconomyMetric() {
		
	}

}
