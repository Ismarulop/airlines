package com.bermairlines.airline.flights.service;

import com.bermairlines.airline.flights.model.FlightEntity;
import com.bermairlines.airline.flights.model.FlightRequest;

import java.util.List;

public interface FlightService {
    List<FlightEntity> getAllFlights();
    List<FlightEntity> getFlightsByOrigin(String origin);

    List<FlightEntity>  getFlightsByDestination(String origin);

    List<String> getOrigins();

    List<FlightEntity> getFlightsByFilters(FlightRequest request);
}
