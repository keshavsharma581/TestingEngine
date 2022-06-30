package com.api.testEngine.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.testEngine.entities.Test;

public interface TestRepository extends CrudRepository<Test,Integer>{
	
	public Test findById(int id);

}
