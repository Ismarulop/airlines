package com.bermairlines.airline.flights.controller;

import com.bermairlines.airline.flights.model.FlightEntity;
import com.bermairlines.airline.flights.model.FlightRequest;
import com.bermairlines.airline.flights.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/flights")
@CrossOrigin
public class FlightController {

    @Autowired
    FlightService flightService;


    @GetMapping("/allflights")
    public ResponseEntity<List<FlightEntity>> getAllFlights(){
        List<FlightEntity> response =flightService.getAllFlights();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/search", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<FlightEntity>> getSearchByFilters(@RequestBody FlightRequest request){
        List<FlightEntity> response =flightService.getFlightsByFilters(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/origins")
    public ResponseEntity<List<String>> getOrigins(){
        List<String> response =flightService.getOrigins();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/origins/{origin}")
    public ResponseEntity<List<FlightEntity>> getFlightByOrigin(@PathVariable String origin){
        List<FlightEntity> response =flightService.getFlightsByOrigin(origin);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/destination/{destination}")
    public ResponseEntity<List<FlightEntity>> getFlightByDestination(@PathVariable String destination){
        List<FlightEntity> response =flightService.getFlightsByDestination(destination);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
