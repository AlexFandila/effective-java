package org.alex.builderpattern;

import lombok.Getter;
import lombok.Setter;

/**
 * Representation of Car model using de builder pattern
 * 
 * @author alex
 * @version 1.0
 * @since 2024-02-11
 */
@Getter
@Setter
public class Car {
	private String make;
	private String model;
	private int year;
	private String color;
	private double engineSize;
	private boolean isElectric;

	private Car(CarBuilder builder) {
		this.make = builder.make;
		this.model = builder.model;
		this.year = builder.year;
		this.color = builder.color;
		this.engineSize = builder.engineSize;
		this.isElectric = builder.isElectric;
	}

	public static class CarBuilder {
		private String make;
		private String model;
		private int year;
		private String color;
		private double engineSize;
		private boolean isElectric;

		public CarBuilder(String model, String make) {
			this.model = model;
			this.make = make;
		}

		public CarBuilder year(int year) {
			this.year = year;
			return this;
		}

		public CarBuilder color(String color) {
			this.color = color;
			return this;
		}

		public CarBuilder engineSize(double engineSize) {
			this.engineSize = engineSize;
			return this;
		}

		public CarBuilder isElectric(boolean isElectric) {
			this.isElectric = isElectric;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}

}
