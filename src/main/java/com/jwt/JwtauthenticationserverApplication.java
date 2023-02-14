package com.jwt;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jwt.model.User;
import com.jwt.repo.UserRepository;

@SpringBootApplication
public class JwtauthenticationserverApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	 Random random=new Random();
	public void createUsers() {
		User user=new User();
		Long id=new Long(random.nextInt(100));
		user.setId(id);
		user.setEmail("user"+id+"@gmail.com");
		user.setPassword("user"+id);
		user.setUsername("user"+id);
		user.setRol("Admin");
		user.setEnable(true);
		User save=this.userRepository.save(user);
		System.out.println(save );
	}
	public static void main(String[] args) {
		System.out.println("main");
		ConfigurableApplicationContext run = SpringApplication.run(JwtauthenticationserverApplication.class, args);
		System.out.println(run);
		
//		new JwtauthenticationserverApplication().createUsers();
		
	}
	@Override
	public void run(String... args) throws Exception { 
		System.out.println("run");
		// TODO Auto-generated method stub
		createUsers();
		System.out.println("run end");
	}

}
