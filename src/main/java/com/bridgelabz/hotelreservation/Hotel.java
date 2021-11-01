package com.bridgelabz.hotelreservation;

public class Hotel {
	String hotelName;
	public int regularCustomerWeekRate;
	public int regularCustomerWeekendRate;
	public int rating;

	//constructor parametrized
	public Hotel(String hotelName, int rating, int regularCustomerWeekRate, int regularCustomerWeekendRate) {
		super();
		this.rating = rating;
		this.hotelName = hotelName;
		this.regularCustomerWeekRate = regularCustomerWeekRate;
		this.regularCustomerWeekendRate = regularCustomerWeekendRate;
	}

	/**
	 * getter-setter methods
	 * @return
	 */
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRegularCustomerWeekRate() {
		return regularCustomerWeekRate;
	}

	public void setRegularCustomerWeekRate(int regularCustomerWeekRate) {
		this.regularCustomerWeekRate = regularCustomerWeekRate;
	}

	public int getRegularCustomerWeekendRate() {
		return regularCustomerWeekendRate;
	}

	public void setRegularCustomerWeekendRate(int regularCustomerWeekendRate) {
		this.regularCustomerWeekendRate = regularCustomerWeekendRate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", regularCustomerWeekRate=" + regularCustomerWeekRate + ", regularCustomerWeekendRate="
				+ regularCustomerWeekendRate + ", rating=" + rating + "]";
	}


}
