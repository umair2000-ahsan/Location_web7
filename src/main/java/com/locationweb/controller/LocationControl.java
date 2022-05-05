package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb.entities.Locations;
import com.locationweb.services.LocationService;
import com.locationweb.utility.EmailService;

@Controller
public class LocationControl {
	
	@Autowired
	private EmailService emailservice;
	@Autowired
	private LocationService locationService;
	 @RequestMapping("/show")
	 public String showPage() {
		 
		return "index";
		 
	 }
	 
	 
	 @RequestMapping("/savePage")
	 public String savePage(@ModelAttribute("loc")Locations location,ModelMap model) {
		 model.addAttribute("msg","Location is saved....");
		 emailservice.sendSimpleMessage("rezaumair2000@gmail.com", "noreply", "Hi I am Umair");
		 locationService.saveLocation(location);
		 
		 return "index";
		 
}	 
//		@RequestMapping("/savePage")
//		public String savePage(@RequestParam("id") long id, @RequestParam("name") String name,@RequestParam("code") String code,@RequestParam("type") String type))
//
//			 System.out.println(id);
//			 System.out.println(name);
//			 System.out.println(code);
//			 System.out.println(type);
//			 
//	 return "index";
//		}

	 
	 @RequestMapping("listall")
	 public String listAll(ModelMap model) {
		 List<Locations> location = locationService.getAllData();
		 model.addAttribute("location",location);
	  return "result";
	 }
	 @RequestMapping("/delete")
	 public String deleteData(@RequestParam("id") long id ,ModelMap model) {
		 locationService.deleteLocationById(id);
		 List<Locations> location = locationService.getAllData();
		 model.addAttribute("location",location);
	  return "result";
	 }
	 
}