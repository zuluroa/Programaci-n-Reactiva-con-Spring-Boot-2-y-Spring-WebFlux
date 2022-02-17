package com.co.sofka.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.co.sofka.models.documents.Categoria;

import reactor.core.publisher.Mono;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String>{
	Mono<Categoria> findByNombre(String nombre);
}
