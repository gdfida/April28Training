package junitTests;

public class Car {

	public static float ComputeEconomy(short milesDriven, short gallonsConsumed) {
		float f1 = (float)milesDriven;
		float f2 = (float)gallonsConsumed;
		float f3 = f1/f2;
		return f3;
		
	}
	public static float ComputeEconomy() {
		return 0;
	}
	

}
