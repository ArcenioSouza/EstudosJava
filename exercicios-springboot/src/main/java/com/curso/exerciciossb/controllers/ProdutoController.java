package com.curso.exerciciossb.controllers;

import java.awt.print.Pageable;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.exerciciossb.model.entities.Produto;
import com.curso.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	//Usando o mesmo método para POST e PUT
//	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
//	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	@GetMapping
	public Iterable<Produto> buscarProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping("/nome/{parteNome}")
	public Iterable<Produto> buscarProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContaining(parteNome);
	}
	
	@GetMapping("/pagina/{numeroPagina}/{qtdePaginas}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePaginas){
		if(qtdePaginas > 5) qtdePaginas = 5;
		PageRequest pagina = PageRequest.of(numeroPagina, qtdePaginas);
		return produtoRepository.findAll(pagina);
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> buscarProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@PutMapping
	public @ResponseBody Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@DeleteMapping("/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
		
		
	}
}
