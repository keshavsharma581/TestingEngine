package com.api.testEngine.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.testEngine.entities.Test;
import com.api.testEngine.services.testServices;

@RestController
public class testControllers {
	
	@Autowired
	private testServices testService;
	
	@GetMapping("/test")
	public ResponseEntity<List<Test>> getTest(){
		List<Test> list =testService.getAllTest();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("test/{id}")
	public ResponseEntity<Test> getTest(@PathVariable("id") int id){
		Test test = testService.getTestById(id);
		if(test ==null) {
			return ResponseEntity.of(Optional.of(test));
		}
		return ResponseEntity.of(Optional.of(test));
	}
	
	@PostMapping("/test")
	public Test addTest(@RequestBody Test test) {
		Test t=this.testService.addTest(test);
		return t;
	}
	
	@DeleteMapping("/test/{testId}")
	public void updateTest(@PathVariable("testId") int testId) {
		this.testService.deleteTest(testId);
	}
	
	@PutMapping("/test/{testId}")
	public Test replaceTest(@RequestBody Test test,@PathVariable ("testId") int testId) {
		this.testService.updateTest(test, testId);
		return test;
	}

}
