package com.curso.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.curso.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
}
