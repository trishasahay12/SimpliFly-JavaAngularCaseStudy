package services;

//package com.laxman.simpli_fly.services;

import entities.Seats;
import java.util.List;

public interface SeatsService {
    List<Seats> getAvailableSeatsByRoute(int routeId);
    Seats reserveSeat(int bookingId, String seatNumber);
    List<Seats> getSeatsByBookingId(int bookingId);
    boolean releaseSeat(int seatId);
    boolean updateSeatAvailability(int seatId, boolean isAvailable);
}

