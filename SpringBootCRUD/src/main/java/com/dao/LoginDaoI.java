package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;

public interface LoginDaoI extends CrudRepository<Login, Integer>
{

}
