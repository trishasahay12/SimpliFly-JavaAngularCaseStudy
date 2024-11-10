package services;

//package com.laxman.simpli_fly.services;

import entities.Routes;
import java.util.List;

public interface RoutesService {
    Routes addRoute(Routes routes);
    Routes getRouteById(int routeId);
    List<Routes> getRoutesByFlightId(int flightId);
    List<Routes> searchRoutes(String origin, String destination, String date);
    Routes updateRoute(Routes route);
    boolean deleteRoute(int routeId);
}
