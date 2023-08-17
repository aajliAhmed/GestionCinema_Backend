package com.sid.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sid.cinema.dao.CinemaRepository;
import com.sid.cinema.service.IcinemaInitService;

@SpringBootApplication 
public class CinemaApplication implements CommandLineRunner {
	@Autowired
	private IcinemaInitService icinemaInitService;

	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
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
