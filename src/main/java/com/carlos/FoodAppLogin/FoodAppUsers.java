package com.carlos.FoodAppLogin;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "FoodAppUsers")
public class FoodAppUsers {
	
    @Id
    public String id;
    
    @Field("username")

    private String username;
    
    @Field("password")

    private	String password;
	
    public String getUsername() {
		return username;
	}
	public FoodAppUsers(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
