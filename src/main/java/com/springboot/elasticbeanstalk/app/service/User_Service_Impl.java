package com.springboot.elasticbeanstalk.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.elasticbeanstalk.app.model.UserModel;

@Service
@Transactional
public class User_Service_Impl implements User_Service {
//	@Autowired
	//private User_DAO user_DAO;

	@Override
	public boolean register(UserModel user) {
		// TODO Auto-generated method stub
		//return user_DAO.register(user);
		return true;
	}

}
