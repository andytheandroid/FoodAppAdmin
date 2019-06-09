package com.carlos.FoodAppLogin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class FoodAppUsersRepositoryImpl implements FoodAppUsersRepository{

	@Autowired
   MongoTemplate mongoTemplate;
	 
	@Override
	public List<FoodAppUsers> findUserByName(String name,String password) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(name).and("password").is(password));
		List<FoodAppUsers> users = mongoTemplate.find(query, FoodAppUsers.class);
		return users;
	}

	@Override
	public <S extends FoodAppUsers> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FoodAppUsers> findAll() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(FoodAppUsers.class);
	}

	@Override
	public List<FoodAppUsers> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FoodAppUsers> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FoodAppUsers> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FoodAppUsers> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FoodAppUsers> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<FoodAppUsers> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FoodAppUsers> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<FoodAppUsers> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<FoodAppUsers> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(FoodAppUsers entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends FoodAppUsers> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends FoodAppUsers> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FoodAppUsers> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends FoodAppUsers> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends FoodAppUsers> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
