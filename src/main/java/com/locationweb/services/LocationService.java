package com.locationweb.services;

import java.util.List;

import com.locationweb.entities.Locations;

public interface LocationService {

	
	public void saveLocation(Locations location);

	public List<Locations> getAllData();

	public void deleteLocationById(long id);

}
