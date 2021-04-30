package junitTests;

public class Car {

	public static float ComputeEconomy(short milesDriven, short gallonsConsumed) {
		float milesDriven1 = (float)milesDriven;
		float gallonsConsumed1 = (float)gallonsConsumed;
		float milesPerGallon = milesDriven1/gallonsConsumed1;
		return milesPerGallon;
		
	}
	public static float ComputeEconomy(int kilometersDriven, int litersConsumed) {
		float kilometersDriven1 = (float)kilometersDriven;
		float litersConsumed1 = (float)litersConsumed;
		float kmPerLiters = kilometersDriven1/litersConsumed1;
		return kmPerLiters;
	}
	

}
