package com.demo.kalyan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kalyanController {

	@Autowired

	public Service hel;

	@GetMapping("/login")

	public List <Entity> log()

	{

	return hel.get();

	}


	}
