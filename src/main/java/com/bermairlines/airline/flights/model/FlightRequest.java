package com.bermairlines.airline.flights.model;

import lombok.Data;

import java.util.Date;

@Data
public class FlightRequest {
    private String origin;
    private String destination;
    private Boolean luggageSwt;
    private Date departureDay;
}

