package com.example.demo.Controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
	@RestController
	public class BLoginController {
		@Autowired
		public Service hel;
		@GetMapping("/login")
		public List<Entity> log()
		{
			return hel.get();
		}
	}
}
