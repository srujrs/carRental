import carrental.Data;

public class Car extends Data {
	private String carType, carModel, carNumber, carColor;
	private double carPrice;
	private boolean status = false;

	public Car( String cT, String cM, String cN, String cC, double cP) {
		carNumber = cN;
		carType = cT;
		carModel = cM;
		carColor = cC;
		carPrice = cP;
	}

	public boolean isCarStatus() {
		return status;
	}
	
	public String getCarNumber() {
		return carNumber;
	}

	public String getCarType() {
		return carType;
	}

	public String getCarModel() {
		return carModel;
	}

	public String getCarColor() {
		return carColor;
	}

	public String getData() {
		return getCarNumber() + " " + getCarType() + " " + getCarColor() + " " + getCarModel();
	}

	public double getCarPrice() {
		return carPrice;
	}
}
