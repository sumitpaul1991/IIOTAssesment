package de.tub.av.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.tub.av.models.MyCV;
import de.tub.av.services.MyCvService;

import java.util.List;

@RestController
public class MyCVController {
	
	@Autowired
	private MyCvService myCvService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/name")
	public List<MyCV> getName() {
		return myCvService.getCVs();
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/name")
	public String addPizza(@RequestBody MyCV name){
		return myCvService.addName(name);
	}
	
	/*@RequestMapping(method = RequestMethod.PUT, path = "/name/{id}")
	public String updatePizza(@PathVariable int id, @RequestBody MyCV name){  
		return myCvService.updateName(id, name);
	}*/
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/name/{id}")
	public String deleteMyPizza(@PathVariable int id){  
		return myCvService.deleteCV(id);
	}

}
