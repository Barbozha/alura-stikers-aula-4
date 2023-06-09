package br.com.alura.alurapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.alurapi.entities.Linguagem;
import br.com.alura.alurapi.repositories.LinguagemRepository;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/")
public class LinguagemController {
	
	@Autowired
	private LinguagemRepository repositorio;
	
	/*
	 * private List<Linguagem> linguagens = List.of(
 			new Linguagem("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 3),
 			new Linguagem("PHP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 4),
 			new Linguagem("JavaScript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_256x256.png", 2),
 			new Linguagem("Python", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png", 1)
	);
	 */
	
	@GetMapping("linguagens")
	public List<Linguagem> obterLinguagem(){
		List<Linguagem> linguagens = repositorio.findAll();
		return linguagens;
	}
	
	@PostMapping("linguagens")
	public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
		Linguagem linguagemSalva = repositorio.save(linguagem);
		return linguagem;
	}
	
	
}
