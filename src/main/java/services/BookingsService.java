package services;

//package com.laxman.simpli_fly.services;

import entities.Bookings;
import java.util.List;

public interface BookingsService {
    Bookings makeBooking(Bookings booking);
    Bookings getBookingById(int bookingId);
    List<Bookings> getUserBookings(int userId);
    Bookings cancelBooking(int bookingId);
    Bookings updateBooking(Bookings booking);
    boolean deleteBooking(int bookingId);
}
