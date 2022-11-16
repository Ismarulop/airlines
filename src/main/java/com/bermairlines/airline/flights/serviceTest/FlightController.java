package com.bermairlines.airline.flights.serviceTest;

import com.bermairlines.airline.flights.model.FlightEntity;
import com.bermairlines.airline.flights.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    FlightService flightService;


    @GetMapping("/allflights")
    public List<FlightEntity> getAllFlights(){
        return flightService.getAllFlights();
    }

//    @GetMapping("/{id}")
//    public String getFlightByOrigin(@PathVariable String id) throws Exception {
//       flightService.getFlightById();
//    }

    @GetMapping("/origins")
    public List<String> getFlightByOrigin(@PathVariable String id){
        return flightService.getOrigins();
    }
}
