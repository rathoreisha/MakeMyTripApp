package com.Ishait.MakeMyTrip.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.Ishait.MakeMyTrip.Model.Passenger;
import com.Ishait.MakeMyTrip.Model.Ticket;
import com.Ishait.MakeMyTrip.Repository.PassengerRepo;

import reactor.core.publisher.Mono;

@Service 
public class ServiceImpl implements PssengerService {

	@Autowired
	private PassengerRepo passengerRepo;
	
	@Override
	public Ticket Booking(Passenger pss) {
		passengerRepo.save(pss);
		String url="http://localhost:9192/Irctc/bookticket";
//		RestTemplate rt=new RestTemplate();
//		ResponseEntity<Ticket> postForEntity = rt.postForEntity(url, pss, Ticket.class);
//		Ticket body = postForEntity.getBody();
//		return body;
		
		WebClient webClient=WebClient.create();
		Ticket block = webClient.post()
		.uri(url)
		.contentType(MediaType.APPLICATION_JSON)
	    .body(BodyInserters.fromValue(pss))
	    .retrieve()
	    .bodyToMono(Ticket.class)
	    .block();
		return block;
	}

}
