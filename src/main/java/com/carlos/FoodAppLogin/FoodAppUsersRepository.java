package com.carlos.FoodAppLogin;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodAppUsersRepository extends  MongoRepository < FoodAppUsers, String > {

	    List<FoodAppUsers> findUserByName(String name,String password);
	 
	   
}