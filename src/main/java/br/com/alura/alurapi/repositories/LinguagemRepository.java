package br.com.alura.alurapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.alura.alurapi.entities.Linguagem;

public interface LinguagemRepository extends MongoRepository<Linguagem, String>{

}
