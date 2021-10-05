package com.sonora.apiRest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonora.apiRest.models.Produtos;



public interface produtoRepository extends JpaRepository<Produtos, Integer> {
	Optional<Produtos> findById(Integer id);
}
