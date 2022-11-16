package com.bermairlines.airline.flights.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


@Data
@AllArgsConstructor
public class FlightEntity {
    private BigInteger id;
    private BigDecimal price;
    private Date flightDate;
    private String origin;
    private String destination;
    private Boolean ida;


}
