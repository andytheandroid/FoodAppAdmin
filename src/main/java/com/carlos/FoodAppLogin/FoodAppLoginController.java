package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodAppLoginController {
	
	@Autowired
	private FoodAppLoginService service;

    @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
    public String performLoginUser(@RequestBody FoodAppUsers user){
    	
    	List<FoodAppUsers> results = service.requestUsers(user.getUsername(), user.getPassword());
    	
    	if(results.isEmpty()) {
    		return "Not found";
    	}
    	else {
    		return "Sucess";
    	}
    }

    
    @RequestMapping(value = "/getusers", method = RequestMethod.POST)
    public List<FoodAppUsers> getusers(){
    	
    	return service.getAllUsers();
    }

	
	
}
