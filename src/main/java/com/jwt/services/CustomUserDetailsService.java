package com.jwt.services;

//import java.util.ArrayList;
import com.jwt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.model.CustomUserDetails;
import com.jwt.repo.UserRepository;
@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
final	User user = this.userRepository.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("user not found !!");
			
		}else {
			return new CustomUserDetails(user);
		}
		
		// TODO Auto-generated method stub
//		if(userName.equals("nitish")) {
//			return new User("nitish", "nitish123",new ArrayList<>()); 
//		}else {
//			throw new UsernameNotFoundException("user not found !!");
//		}
		
	}
	

}