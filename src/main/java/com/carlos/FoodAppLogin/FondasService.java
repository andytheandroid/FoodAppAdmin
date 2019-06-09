package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class FondasService {
	
	@Autowired
	private FondasRepositoryImpl userRepo;

	
	public List<Fondas> getFondas(){
		
		return userRepo.findAll();
		
	}
	
	public Fondas addFonda(Fondas fonda){
		return  userRepo.insert(fonda);
		
	}
		
		
}
