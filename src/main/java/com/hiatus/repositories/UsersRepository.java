package com.hiatus.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiatus.entities.Users;

@Repository("usersRepository")
public interface UsersRepository extends CrudRepository<Users, Integer>{
	
}
