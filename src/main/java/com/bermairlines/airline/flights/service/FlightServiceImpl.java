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
        List<FlightEntity> flightEntityList = createList();

        return flightEntityList;
    }

    private static List<FlightEntity> createList() {
        List<FlightEntity> flightEntityList = new ArrayList<>();
        FlightEntity flightEntity1= new FlightEntity(BigInteger.ONE,BigDecimal.valueOf(200.034),new Date(),"Sevilla","Alicante",false);
        FlightEntity flightEntity2= new FlightEntity(BigInteger.TWO,BigDecimal.valueOf(100.44),new Date(),"Alicante","New York",true);
        FlightEntity flightEntity3= new FlightEntity(BigInteger.TWO,BigDecimal.valueOf(100.44),new Date(),"Marbella","Madrid",true);
        FlightEntity flightEntity4= new FlightEntity(BigInteger.TWO,BigDecimal.valueOf(100.44),new Date(),"Cadiz","Lisboa",true);
        FlightEntity flightEntity5= new FlightEntity(BigInteger.TWO,BigDecimal.valueOf(100.44),new Date(),"Huelva","Alicante",false);
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

//    @Override
//    public List<String> getOrigins(String origin) {
//        List<FlightEntity> flightEntityList = createList();
//
//        for (int i = 0; i < flightEntityList.size(); i++) {
//            if()
//        }
//        return origins;
//    }
}
