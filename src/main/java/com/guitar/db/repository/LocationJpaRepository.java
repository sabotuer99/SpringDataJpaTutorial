package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitar.db.model.Location;

public interface LocationJpaRepository extends JpaRepository<Location, Long> {
	List<Location> findByStateLike(String stateName);
	List<Location> findByStateLikeIgnoreCase(String stateName);
	
	List<Location> findByStateStartingWith(String stateName);
	List<Location> findByStateNot(String stateName);
	List<Location> findByStateNotLike(String stateName);
	
	List<Location> findByStateIsOrCountryEquals(String value1, String value2);	
	List<Location> findByStateAndCountry(String value1, String value2);
}
