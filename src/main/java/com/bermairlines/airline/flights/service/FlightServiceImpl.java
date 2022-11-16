package com.bermairlines.airline.flights.service;

import com.bermairlines.airline.flights.model.FlightEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Override
    public List<FlightEntity> getAllFlights() {
        List<FlightEntity> flightEntityList = new ArrayList<>();
        FlightEntity flightEntity1= new FlightEntity(BigInteger.ONE,BigDecimal.valueOf(200.034),new Date(),"Sevilla");
        FlightEntity flightEntity2= new FlightEntity(BigInteger.TWO,BigDecimal.valueOf(100.44),new Date(),"Alicante");
        FlightEntity flightEntity3= new FlightEntity(BigInteger.TWO,BigDecimal.valueOf(100.44),new Date(),"Marbella");
        FlightEntity flightEntity4= new FlightEntity(BigInteger.TWO,BigDecimal.valueOf(100.44),new Date(),"Cadiz");
        FlightEntity flightEntity5= new FlightEntity(BigInteger.TWO,BigDecimal.valueOf(100.44),new Date(),"Huelva");
        flightEntityList.add(flightEntity1);
        flightEntityList.add(flightEntity2);
        flightEntityList.add(flightEntity3);
        flightEntityList.add(flightEntity4);
        flightEntityList.add(flightEntity5);

        return flightEntityList;
    }

    @Override
    public FlightEntity getFlightById() {

        return null;
    }

    @Override
    public List<String> getOrigins() {
        List<String> origins= new ArrayList<>();
        origins.add("Malaga");
        origins.add("Alicante");
        origins.add("Sevilla");
        return origins;
    }
}
