package com.hiatus.services;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hiatus.entities.Role;
import com.hiatus.entities.Users;
import com.hiatus.repositories.RoleRepository;
import com.hiatus.repositories.UsersRepository;


@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
    private RoleRepository roleRepository;
    
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	public void setUsersRepository(UsersRepository usersRepository) {
	      this.usersRepository= usersRepository;
	}
	
	public Users save(Users user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole(user.getUserRole());
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		return usersRepository.save(user);
	}
}
