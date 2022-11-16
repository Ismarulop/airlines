package com.bermairlines.airline.flights.model;

import lombok.Data;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


@Data
public class FlightEntity {
    private BigInteger id;
    private BigDecimal price;
    private Date flightDate;
    private String origin;
    private String destination;

    public FlightEntity(BigInteger id, BigDecimal price, Date flightDate,String origin) {
        this.id=id;
        this.price=price;
        this.flightDate=flightDate;
        this.origin=origin;

    }
}
