package com.susan.craftbarservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.susan.craftbarservice.model.Beer;
import com.susan.craftbarservice.repository.BeerRepository;
import com.susan.craftbarservice.util.BeerNotFoundException;

@Service
public class CraftBarService {

	@Autowired
	private BeerRepository beerRepository;
	
	public List<Beer> getBeers() {
		return beerRepository.findAll();
	}

	public Beer getBeer(@PathVariable Long id) {
		return beerRepository
				.findById(id)
				.orElseThrow(()-> new BeerNotFoundException(id));
	}

	public Beer addBeer(@RequestBody Beer beer) {
		return beerRepository.save(beer);
	}

	public Beer updateBeer(@RequestBody Beer updatedBeer, @PathVariable Long id) {
		return beerRepository
				.findById(id)
				.map(beer -> {
					beer.setName(updatedBeer.getName());
					return beerRepository.save(beer);
				}).orElseGet(()-> {
					return beerRepository.save(updatedBeer);
				});
				
	}

	public void removeBeer(@PathVariable Long id) {
		beerRepository.deleteById(id);
	}

}
