package com.sonora.apiRest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonora.apiRest.models.Produtos;
import com.sonora.apiRest.repository.produtoRepository;

@RestController
@RequestMapping(value="/api")
public class ProdutoResource {
	
	@Autowired
	produtoRepository produtoRepository;
	
	
	@GetMapping("/produtos")
	public List<Produtos> listaProduto(){
		return produtoRepository.findAll();
	}
	
	
	@GetMapping("/produto/{id}")
	public Optional<Produtos> listaProdutoUnico(@PathVariable(value="id")Integer id) {
		return produtoRepository.findById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200/")
	@PostMapping("/produto")
	public Produtos salvaProduto(@RequestBody Produtos produto) {
		return produtoRepository.save(produto);
	}
	
	
	@DeleteMapping("/produto")
	public void deletaProduto(@RequestBody Produtos produto) {
		produtoRepository.delete(produto);
	}
	
	@CrossOrigin(origins = "http://localhost:4200/")
	@PutMapping("/produto")
	public Produtos atualizaProduto(@RequestBody Produtos produto) {
		return produtoRepository.save(produto);
	}
	
}
