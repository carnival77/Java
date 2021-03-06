package com.app1;

public class Truck extends Car {

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getEfficiency() {
		// TODO Auto-generated method stub

		return super.getEfficiency() - 0.2 * (getCurWeight() / 5);
	}

	@Override
	public int getCurWeight() {
		// TODO Auto-generated method stub
		return super.getCurWeight();
	}

	@Override
	public void moving(int distance) {
		double calc_oil = calcOil(distance);

		setRestOil(getRestOil() - calc_oil);

		// TODO Auto-generated method stub
		super.moving(distance);
	}

	private double calcOil(int distance) {
		int temp = (int) (distance / getEfficiency());

		return temp;
	}

	@Override
	public void setRestOil(double restOil) {
		// TODO Auto-generated method stub
		super.setRestOil(restOil);
	}

	@Override
	public double getRestOil() {
		// TODO Auto-generated method stub
		return super.getRestOil();
	}

	public int getCost(int distance) {
		int result = 0;
		double calc_oil = calcOil(distance);

		result = (int) (3000 * calc_oil);
		return result;
	}

	@Override
	public String toString() {
		return "Truck [getEfficiency()=" + getEfficiency() + super.toString() + "]";
	}

}
