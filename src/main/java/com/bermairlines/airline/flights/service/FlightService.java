package com.bermairlines.airline.flights.service;

import com.bermairlines.airline.flights.model.FlightEntity;

import java.util.List;

public interface FlightService {
    List<FlightEntity> getAllFlights();

    FlightEntity getFlightById();

//    List<String> getOrigins(String origin);
}
