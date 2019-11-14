package com.jcah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class villa {

	@GetMapping({"/","/index","/home"})
	public String home() {

		return "index";
	}

	@GetMapping("/nosotros")
	public String nosotros() {

		return "nosotros";
	}

	@GetMapping("/cumple")
	public String cumpleanos() {

		return "cumple";

	}

	@GetMapping("/directorio")
	public String directorio() {

		return "directorio";

	}

	@GetMapping("/viernes")
	public String premioSemanal() {

		return "viernes";
	}

	@GetMapping("/contacto")
	public String buzon() {

		return "contacto";

	}
}
