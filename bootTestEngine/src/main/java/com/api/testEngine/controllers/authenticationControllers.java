package com.api.testEngine.controllers;

import java.util.List;
import java.util.Optional;

import com.api.testEngine.entities.User;
import com.api.testEngine.services.authenticationServices;
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

@RestController
public class authenticationControllers {

	@Autowired
	private authenticationServices authenticationService;
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getUser(){
		List<User> list = authenticationService.getAllUser();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getBook(@PathVariable("id") int id){
		User user = authenticationService.getUserById(id);
		if(user==null) {
			return ResponseEntity.of(Optional.of(user));
		}
		return ResponseEntity.of(Optional.of(user));
	}
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		User u=this.authenticationService.addUser(user);
		return u;
	}
	
	@DeleteMapping("/user/{userId}")
	public void updateUser(@PathVariable("userId")int userId) {
		this.authenticationService.deleteUser(userId);
	}
	
	
	@PutMapping("/user/{userId}")
	public User replaceUser(@RequestBody User user,@PathVariable("userId") int userId) {
		this .authenticationService.updateUser(user, userId);
		return user;
	}
	
	/*
	 @PutMapping("/user/{userId}")
	public User replacePassword(@RequestBody User user,@PathVariable("userId") int userId) {
		this.authenticationService.updatePassword(user, userId);
		return user;
	}
	*/
	
	
	
	
	
}
