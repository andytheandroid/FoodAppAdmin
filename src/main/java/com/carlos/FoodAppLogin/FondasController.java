package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FondasController {


	@Autowired
	private FondasService service;
	
    @CrossOrigin(origins = "https://murmuring-dawn-57579.herokuapp.com/index.html")
    @RequestMapping(value = "/getfondas", method = RequestMethod.POST)
    public List<Fondas> getfondas(){
    	
    	return service.getFondas();
    }

    @RequestMapping(value = "/addfondas", method = RequestMethod.POST)
    public ResponseEntity<String> addfondas(@RequestBody Fondas fonda){
    	service.addFonda(fonda);
    	return ResponseEntity.ok("Registered");
    }

    

}
