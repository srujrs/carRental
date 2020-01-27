import java.util.*;
import java.io.*;

public class Car {
	private String carNumber;
	private String carType, carModel, carColor;
	private double carPrice;

	public Car() {
		carNumber = "";
		carType = "";
		carModel = "";
		carColor = "";
		carPrice = 0;
	}

	public void setCar(String cN, String cT, String cM, String cC, double cP){
		carNumber = cN;
		carType = cT;
		carModel = cM;
		carColor = cC;
		carPrice = cP;
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

	public String getCar() {
		return getCarNumber() + " : " + getCarType() + " " + getCarColor() + " " + getCarModel();
	}

	public double getCarPrice() {
		return carPrice;
	}
}
