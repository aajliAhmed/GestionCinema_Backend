package com.sid.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sid.cinema.entities.Cinema;
import com.sid.cinema.entities.Ticket;
@RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
