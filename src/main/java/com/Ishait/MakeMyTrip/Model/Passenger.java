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

@Table(name="Passenger_Details")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "passenger_Id")
	private  Integer pid;
	
	@Column(name = "passenger_Fname")
	private String fname;
	
	@Column(name = "passenger_Lname")
	private String lname;
	
	@Column(name = "passenger_From")
	private String f;
	
	@Column(name = "passenger_To")
	private String t;
	


}
