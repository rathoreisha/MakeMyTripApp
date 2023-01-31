package com.Ishait.MakeMyTrip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ishait.MakeMyTrip.Model.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer>{

}
