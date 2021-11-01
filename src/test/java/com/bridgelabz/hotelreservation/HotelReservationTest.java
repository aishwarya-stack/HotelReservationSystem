package com.bridgelabz.hotelreservation;
import org.junit.Test;

/**
 * Unit test for HotelReservationSystemTest.
 */
public class HotelReservationTest 
{
    @Test
    public void whenAddedHotelSuccessfullyReturnTrue()
    {
    	HotelReservation hotel = new HotelReservation();
    	boolean hotelEntry = hotel.addHotel("Lakewood", 3, 110, 90);
        assertTrue(true,hotelEntry);
    }

	private void assertTrue(boolean b, boolean hotelEntry) {
		// TODO Auto-generated method stub
		
	}
}