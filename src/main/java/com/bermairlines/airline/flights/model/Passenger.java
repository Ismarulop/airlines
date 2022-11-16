package com.bermairlines.airline.flights.model;

import lombok.Data;

@Data
public class Passenger {
    private int id;
    private String name;
    private String surname;
    private String nacionality;
    private String dni;
    private int age;
}
