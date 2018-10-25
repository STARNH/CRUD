package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginDaoI;
import com.dao.RoleDaoI;
import com.dao.UserDaoI;

@Service
public class ServiceImple 
{
	@Autowired
	LoginDaoI logindao;
	
	@Autowired
	UserDaoI userdao;
	
	@Autowired
	RoleDaoI roleDao;

}
