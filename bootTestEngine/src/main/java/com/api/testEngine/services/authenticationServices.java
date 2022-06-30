package com.api.testEngine.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.testEngine.dao.UserRepository;
import com.api.testEngine.entities.User;

import java.util.ArrayList;
import java.util.List;



@Component
public class authenticationServices {

	/*private static List<User> list =new ArrayList<>();
	static {
		list.add(new User("Keshav","Sharma","stg.pauljackson@gmail.com","112233",0));
	}*/
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser()
	{
		List<User> list =(List<User>) this.userRepository.findAll();
		return list; 
	}
	public User getUserById(int id) {
		User user =null;
		try {
			user =this.userRepository.findById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public User addUser(User u) {
		User us=userRepository.save(u);
		return us;
	}
	public void deleteUser (int uid)
	{
		userRepository.deleteById(uid);
	}
	public void updateUser (User user,int userId)
	{
		
		
		/*list = list.stream().map(u->{
			if(u.getId()==userId)
			{
				u.setFirst_name(user.getFirst_name());
				u.setLast_name(user.getLast_name());
				u.setEmail(user.getEmail());
			}
			
			return u;
		
		}).collect(Collectors.toList()); */
		
		user.setId(userId);
		userRepository.save(user);
	}
	
	/*
	public void updatePassword(User user,int userId) {
		user.setPassword(user.getPassword());
		userRepository.save(user);
	}
	*/
	
}
