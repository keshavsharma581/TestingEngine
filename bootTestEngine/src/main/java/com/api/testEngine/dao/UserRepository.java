package com.api.testEngine.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.testEngine.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	public User findById(int id);

}
