package com.susan.craftbarservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susan.craftbarservice.model.Beer;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {

}
