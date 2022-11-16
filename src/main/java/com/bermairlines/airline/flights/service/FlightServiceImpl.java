package com.bermairlines.airline.flights.service;

import com.bermairlines.airline.flights.model.FlightEntity;
import com.bermairlines.airline.flights.model.FlightRequest;
import com.bermairlines.airline.flights.model.Passenger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Override
    public List<FlightEntity> getAllFlights() {
        return createList();
    }

    private static List<FlightEntity> createList() {
        List<FlightEntity> flightEntityList = new ArrayList<>();
        List<String> scales = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        scales.add("Roma");
        scales.add("St.Petersburgo");
        Passenger passenger = new Passenger();
        passenger.setName("Joe");
        Passenger passenger2 = new Passenger();
        passenger2.setName("Ali");
        passengers.add(passenger);
        passengers.add(passenger2);
        FlightEntity flightEntity1 = new FlightEntity(1, BigDecimal.valueOf(200.034), new Date(), "Sevilla", "Alicante", false, 111, "Iberia", new Date(), new Date(), new Date(), false, false, null, passengers);
        FlightEntity flightEntity2 = new FlightEntity(2, BigDecimal.valueOf(100.44), new Date(), "Alicante", "New York", true, 222, "Vueling", new Date(), new Date(), new Date(), false, true, scales, passengers);
        FlightEntity flightEntity3 = new FlightEntity(3, BigDecimal.valueOf(100.44), new Date(), "Marbella", "Madrid", true, 333, "Ryanair", new Date(), new Date(), new Date(), false, false, null, passengers);
        FlightEntity flightEntity4 = new FlightEntity(4, BigDecimal.valueOf(100.44), new Date(), "Cadiz", "Lisboa", true, 444, "Iberia", new Date(), new Date(), new Date(), false, true, scales, passengers);
        FlightEntity flightEntity5 = new FlightEntity(5, BigDecimal.valueOf(100.44), new Date(), "Huelva", "Alicante", false, 555, "Iberia", new Date(), new Date(), new Date(), false, false, null, passengers);
        flightEntityList.add(flightEntity1);
        flightEntityList.add(flightEntity2);
        flightEntityList.add(flightEntity3);
        flightEntityList.add(flightEntity4);
        flightEntityList.add(flightEntity5);
        return flightEntityList;
    }

    @Override
    public List<FlightEntity> getFlightsByOrigin(String origin) {
        List<FlightEntity> flightEntityList = createList();
        for (int i = 0; i < flightEntityList.size(); i++) {
            if (origin.equals(flightEntityList.get(i).getOrigin())) {
                flightEntityList.add(flightEntityList.get(i));
            }
        }
        return flightEntityList;
    }

    @Override
    public List<FlightEntity> getFlightsByDestination(String destination) {
        List<FlightEntity> flightEntityList = createList();
        for (int i = 0; i < flightEntityList.size(); i++) {
            if (destination.equals(flightEntityList.get(i).getDestination())) {
                flightEntityList.add(flightEntityList.get(i));
            }
        }
        return flightEntityList;
    }

    @Override
    public List<String> getOrigins() {
        List<String> origins = new ArrayList<>();
        origins.add("Sevilla");
        origins.add("Alicante");
        origins.add("Marbella");
        origins.add("Cadiz");
        origins.add("Huelva");
        return origins;
    }

    @Override
    public List<FlightEntity> getFlightsByFilters(FlightRequest request) {
        List<FlightEntity> flightEntityList = createList();
        List<FlightEntity> response = new ArrayList<>();
        for (FlightEntity flight : flightEntityList) {
            if (request.getDestination().equals(flight.getDestination()) &&
                    request.getLuggageSwt().equals(flight.getLuggageSwt())) {
                response.add(flight);
            }
        }

        return response;
    }
}
