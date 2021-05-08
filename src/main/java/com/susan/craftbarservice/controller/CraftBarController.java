package com.susan.craftbarservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.susan.craftbarservice.model.Beer;
import com.susan.craftbarservice.service.CraftBarService;

@RestController
@RequestMapping("/api")
public class CraftBarController {
	
	@Autowired
	private CraftBarService service;
	
	@GetMapping("/beers")
	public ResponseEntity<List<Beer>> getBeers() {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(service.getBeers());
	}
	
	@GetMapping("/beers/{id}")
	public ResponseEntity<Beer> getBeer(@PathVariable Long id) {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(service.getBeer(id));
	}
	
	@PostMapping("/beers")
	public ResponseEntity<Beer> addBeer(@RequestBody Beer beer) {
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(service.addBeer(beer));
	}
	
	@PutMapping("/beers/{id}")
	public ResponseEntity<Beer> updateBeer(@RequestBody Beer updatedBeer, @PathVariable Long id) {
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(service.updateBeer(updatedBeer, id));
				
	}
	
	@DeleteMapping("/beers/{id}")
	public ResponseEntity<?> removeBeer(@PathVariable Long id) {
		service.removeBeer(id);
		return ResponseEntity.noContent().build();
	}

}
