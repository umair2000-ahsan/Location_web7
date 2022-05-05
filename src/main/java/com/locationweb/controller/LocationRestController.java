package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationweb.entities.Locations;
import com.locationweb.repositories.LocationRepository;

@RestController
@RequestMapping("/location/api")
public class LocationRestController {
	@Autowired
	LocationRepository locationRepo;
	@GetMapping
	List <Locations> getLocation() {
		List<Locations> location = locationRepo.findAll();
		return location;
		
		
	}
	@PostMapping
	public void saveLocation(Locations location) {
		locationRepo.save(location);
		
	}
}
