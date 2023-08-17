package com.sid.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sid.cinema.entities.Categorie;
import com.sid.cinema.entities.Cinema;
@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
