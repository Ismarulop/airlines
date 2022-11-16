package com.bermairlines.airline.flights.flightservicetest;

import com.bermairlines.airline.flights.model.FlightEntity;
import com.bermairlines.airline.flights.model.Passenger;
import com.bermairlines.airline.flights.service.FlightService;
import com.bermairlines.airline.flights.service.FlightServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class FlightServiceTests {
    private static final FlightService flightService = new FlightServiceImpl();

    @Test
    void shouldReturnList(){
        List<FlightEntity> flightEntityList = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger = new Passenger();
        passenger.setName("Joe");
        Passenger passenger2 = new Passenger();
        passenger2.setName("Ali");
        passengers.add(passenger);
        passengers.add(passenger2);
        FlightEntity flightEntity= new FlightEntity(1, BigDecimal.valueOf(200.034), new Date(), "Sevilla", "Alicante", false, 111, "Iberia", new Date(), new Date(), new Date(), false, false, null, passengers);
        flightEntityList.add(flightEntity);

        List<FlightEntity> response = flightService.getAllFlights();

        Assertions.assertEquals(flightEntityList.get(0).getId(),response.get(0).getId());
        Assertions.assertEquals(flightEntityList.get(0).getPrice(),response.get(0).getPrice());
    }
}
