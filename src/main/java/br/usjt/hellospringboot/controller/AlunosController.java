package br.usjt.hellospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import br.usjt.hellospringboot.model.Aluno;
import br.usjt.hellospringboot.repository.AlunosRepository;

@Controller
public class AlunosController {
	// iNJEÇÃO DE DEPENDENCIA OCORRE AQUI
	@Autowired
	private AlunosRepository alunosRepo;
	@GetMapping ("/alunos")
	public ModelAndView listarAlunos () {
		//passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView ("lista_alunos");
		//Busque a coleção com o repositório
		mv.addObject(new Aluno());
		List <Aluno> alunos = alunosRepo.findAll();
		//adicione a coleção ao objeto ModelAndView
		mv.addObject("alunos", alunos);
		//devolva o ModelAndView
		return mv;
		

	}
}