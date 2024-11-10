package services;
//package com.laxman.simpli_fly.services;

import entities.Flights;
import java.util.List;

public interface FlightsService {
    Flights addFlight(Flights flights);
    Flights getFlightById(int flightId);
    List<Flights> getAllFlights();
    Flights updateFlight(Flights flights);
    boolean deleteFlight(int flightId);
}

