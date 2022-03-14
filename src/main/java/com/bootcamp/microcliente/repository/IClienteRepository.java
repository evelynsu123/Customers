package com.bootcamp.microcliente.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.microcliente.entity.Cliente;

import reactor.core.publisher.Mono;

public interface IClienteRepository extends ReactiveMongoRepository<Cliente, String>{
	
	Mono <Cliente> findByDni(String name);

}
