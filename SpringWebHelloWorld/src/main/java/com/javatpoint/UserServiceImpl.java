package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

	@Autowired
	public UserDao userDao;
	 
	public int register(User user) {
	    return userDao.register(user);
	  }

	  public User validateUser(Login login) {
		
	    return userDao.validateUser(login);
	  }


}
