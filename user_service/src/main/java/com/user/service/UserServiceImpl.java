package com.user.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	//fake user list...
	List<User> list = List.of(new User(1311L, "Aakash", "9876543210"), new User(1312L, "Vikash", "9876543210"), new User(1313L, "Ajay", "9876543210"));

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
