package com.curso.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.curso.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContaining(String parteNome);
}
