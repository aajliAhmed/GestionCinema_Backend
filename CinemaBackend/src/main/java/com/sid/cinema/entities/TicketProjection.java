package com.sid.cinema.entities;

import org.springframework.data.rest.core.config.Projection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.ManyToOne;

@Projection(name = "ticketProj" ,types = Ticket.class)
public interface TicketProjection {
	public Long getId();
	public String getNomClient();
	public double getPrix();
	public int getCodePayement();
	public boolean getReserve();
	public Place getPlace();
	
}
