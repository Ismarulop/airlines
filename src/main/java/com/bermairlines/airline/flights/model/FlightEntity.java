package com.bermairlines.airline.flights.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
public class FlightEntity {
    private int id;
    private BigDecimal price;
    private Date flightDate;
    private String origin;
    private String destination;
    private Boolean ida;
    private int flightNumber;
    private String company;
    private Date departureDay;
    private Date transitTime;
    private Date layover;
    private Boolean luggageSwt;
    private Boolean scalesSwt;
    private List<String> scales;
    private List<Passenger> passengers;




}
