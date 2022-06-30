package com.api.testEngine.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.testEngine.entities.Result;

public interface ResultRepository extends CrudRepository<Result,Integer> {

	public Result findById(int id);
	
}
