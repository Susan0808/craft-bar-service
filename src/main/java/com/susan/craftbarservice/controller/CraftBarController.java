package com.susan.craftbarservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Beer> getBeers() {
		return service.getBeers();
	}
	
	@GetMapping("/beers/{id}")
	public Beer getBeer(@PathVariable Long id) {
		return service.getBeer(id);
	}
	
	@PostMapping("/beers")
	public Beer addBeer(@RequestBody Beer beer) {
		return service.addBeer(beer);
	}
	
	@PutMapping("/beers/{id}")
	public Beer updateBeer(@RequestBody Beer updatedBeer, @PathVariable Long id) {
		return service.updateBeer(updatedBeer, id);
				
	}
	
	@DeleteMapping("/beers/{id}")
	public void removeBeer(@PathVariable Long id) {
		service.removeBeer(id);
	}

}
