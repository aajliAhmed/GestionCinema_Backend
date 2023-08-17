package com.sid.cinema.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.cinema.dao.CategorieRepository;
import com.sid.cinema.dao.CinemaRepository;
import com.sid.cinema.dao.FilmRepository;
import com.sid.cinema.dao.PlaceRepository;
import com.sid.cinema.dao.ProjectionRepository;
import com.sid.cinema.dao.SalleRepository;
import com.sid.cinema.dao.SeanceRepository;
import com.sid.cinema.dao.VilleRepository;
import com.sid.cinema.entities.Cinema;
import com.sid.cinema.entities.Place;
import com.sid.cinema.entities.Salle;
import com.sid.cinema.entities.Ville;

@Service
public class CinemaInitServiceImpl implements IcinemaInitService {
	@Autowired
	private VilleRepository villeRepository;
	@Autowired
	private CinemaRepository cinemaRepository;
	@Autowired
	private SalleRepository salleRepository;
	@Autowired
	private PlaceRepository placeRepository;
	@Autowired
	private SeanceRepository seanceRepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private ProjectionRepository projectionRepository;
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Override
	public void initVilles() {
		Stream.of("Casablanca","Marrakech","Rabat", "Tanger").forEach(nameVille->{
			Ville ville = new Ville();
			ville.setNom(nameVille);
			villeRepository.save(ville);
		});
		
	}

	@Override
	public void initCinimas() {
		villeRepository.findAll().forEach(v->{
			Stream.of("Megarama","IMAX","FOUNOUN","CHAHRAZAD")
			.forEach(nameCinema->{
				Cinema cinema = new Cinema();
				cinema.setName(nameCinema);
				cinema.setNombreSalles(3+(int)(Math.random()*7));
				cinema.setVille(v);
			});
		});
		
	}

	@Override
	public void initSalles() {
		cinemaRepository.findAll().forEach(cinema->{
			for(int i=0;i<cinema.getNombreSalles();i++) {
				Salle salle = new Salle();
				salle.setNom("Salle "+(i+1));
				salle.setCinema(cinema);
				salle.setNombrePlace(15+(int)(Math.random()*20));
				salleRepository.save(salle);
			}
		});
		
	}

	@Override
	public void initSeances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initPlaces() {
		salleRepository.findAll().forEach(salle->{
			for(int i=0; i<salle.getNombrePlace();i++) {
				Place place = new Place();
				place.setNumeroPlace(i+1);
				place.setSalle(salle);
				placeRepository.save(place);
			}
		});
		
	}

	@Override
	public void initCategories() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initFilms() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initProjections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTickets() {
		// TODO Auto-generated method stub
		
	}
	
}
