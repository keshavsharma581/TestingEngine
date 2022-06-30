package com.api.testEngine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.testEngine.dao.ResultRepository;
import com.api.testEngine.entities.Result;


@Component
public class resultServices {

	@Autowired
	private ResultRepository resultRepository;
	
	public List<Result> getAllResult()
	{
		List<Result> list= (List<Result>) this.resultRepository.findAll();
		return list;
	}
	
	public Result getResultById(int id) {
		Result result =null;
		try {
			result= this.resultRepository.findById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public Result addResult(Result r) {
		Result rs=resultRepository.save(r);
		return rs;
	}
	public void deleteResult(int rid) {
		resultRepository.deleteById(rid);
	}
	public void updateResult( Result r,int rid) {
		r.setId(rid);
		resultRepository.save(r);
	}
}
