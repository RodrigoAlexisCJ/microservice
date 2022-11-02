package com.tcs.microservices.limit.sevice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.microservices.limit.sevice.bean.Limits;
import com.tcs.microservices.limit.sevice.configuration.Configuration;

@RestController
public class LimistController {
	@Autowired
	private Configuration con;
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(con.getMinimum(),con.getMaximum());
		
	}
}
