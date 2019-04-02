package com.fonix.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.fonix.demo.Entity.Users;

public interface UserRepository  extends CrudRepository<Users, Long> {
	
	 

}
