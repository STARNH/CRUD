package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.ServiceI;

@Controller
public class HomeController 
{
	@Autowired
	ServiceI service;

}
