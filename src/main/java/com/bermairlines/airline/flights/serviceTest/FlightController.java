package com.bermairlines.airline.flights.serviceTest;

import com.bermairlines.airline.flights.model.FlightEntity;
import com.bermairlines.airline.flights.service.FlightService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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




//    @GetMapping("/origins/{origin}")
//    public List<String> getFlightByOrigin(@PathVariable String Origin){
//        return flightService.getOrigins(origin);
//    }
}
