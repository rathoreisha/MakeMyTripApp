package com.Ishait.MakeMyTrip.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ishait.MakeMyTrip.Model.Passenger;
import com.Ishait.MakeMyTrip.Model.Ticket;
import com.Ishait.MakeMyTrip.Services.PssengerService;

@RestController
public class PassengerController {
	
	@Autowired
	private PssengerService pssengerService;
	
	@PostMapping("/Booking")
	public ResponseEntity<Ticket> TicketBooking(@RequestBody Passenger pass)
	{
		Ticket booking = pssengerService.Booking(pass);
		return new ResponseEntity<Ticket>(booking,HttpStatus.OK);
	}

}
