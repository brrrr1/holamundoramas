package com.salesianostriana.dam.holamundoramas.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

	public String sayHello() {
		return "index.html";
	}

}
