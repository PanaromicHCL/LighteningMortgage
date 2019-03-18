package com.mortgage;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mortgage.model.User;
import com.mortgage.repository.UserRepository;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@DataJpaTest
public class UserRepositoryTest{
//
//	@Autowired
//	private UserRepository userRepository;
//
//	@Test
//	public void saveTransaction() {
//		User user = new User();
//		user.setUserName("sree2");
//		user.setPassword("sree2");
//
//		User userResponse = userRepository.save(user);
//
//		assertNotNull(userResponse);
//	}
}
