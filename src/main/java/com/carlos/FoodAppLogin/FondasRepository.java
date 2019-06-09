package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FondasRepository extends  MongoRepository < Fondas, String > {
	
	
    List<Fondas> getAllFondas();
    


}
