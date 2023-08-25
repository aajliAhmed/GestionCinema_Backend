package com.sid.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.sid.cinema.dao.CinemaRepository;
import com.sid.cinema.entities.Film;
import com.sid.cinema.entities.Salle;
import com.sid.cinema.entities.Ticket;
import com.sid.cinema.service.IcinemaInitService;

@SpringBootApplication 
public class CinemaApplication implements CommandLineRunner {
	@Autowired
	private IcinemaInitService icinemaInitService;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Film.class,Salle.class,Ticket.class);
		icinemaInitService.initVilles();
		icinemaInitService.initCinimas();
		icinemaInitService.initSalles();
		icinemaInitService.initPlaces();
		icinemaInitService.initSeances();
		icinemaInitService.initCategories();
		icinemaInitService.initFilms();
		icinemaInitService.initProjections();
		icinemaInitService.initTickets();
		
	}

}
