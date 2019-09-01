package br.usjt.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringBootController {

	@RequestMapping ("")
	public String hello() {
		return "lista_alunos";
	}
	
}
