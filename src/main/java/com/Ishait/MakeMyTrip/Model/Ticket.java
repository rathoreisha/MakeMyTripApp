package com.Ishait.MakeMyTrip.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data

@Table(name="Ticket_Details")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Ticket_Id")
	private Integer tid;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Ticket_PNR")
	private int pnr;
	
	@Column(name="Ticket_Status")
	 private String ticketStatus;
	 
	@Column(name="Ticket_Price")
	 private double ticketPrice;

}
