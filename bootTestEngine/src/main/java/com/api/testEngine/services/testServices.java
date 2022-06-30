package com.api.testEngine.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.testEngine.dao.TestRepository;
import com.api.testEngine.entities.Test;


@Component
public class testServices {

	
	@Autowired
	private TestRepository testRepository;
	
	private static List<Test> list =new  ArrayList<>();
	
	public List<Test> getAllTest(){
		List<Test> list= (List<Test>) this.testRepository.findAll();
		return list;
	}
	
	public Test getTestById(int id) {
		Test test =null;
		try {
			test =this.testRepository.findById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return test;
	}
	
	public Test addTest(Test t) {
		Test ts=testRepository.save(t);
		return ts;
	}
	
	public void deleteTest (int tid)
	{
		testRepository.deleteById(tid);
	}
	
	public void updateTest (Test test,int testId)
	{	
		test.setId(testId);
		testRepository.save(test);
	}
	
	
}
