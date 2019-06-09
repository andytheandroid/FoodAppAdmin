package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class FoodAppLoginService {

	@Autowired
	private FoodAppUsersRepositoryImpl userRepo;
	
	
	public List<FoodAppUsers> requestUsers(String name,String password){
		
	List<FoodAppUsers> results = userRepo.findUserByName(name, password);
	return results;
	}
	
	public List<FoodAppUsers> getAllUsers(){
		return  userRepo.findAll();
	
	}
}
