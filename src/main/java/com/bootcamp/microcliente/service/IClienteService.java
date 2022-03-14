package com.bootcamp.microcliente.service;

import com.bootcamp.microcliente.dto.ClienteDto;
import com.bootcamp.microcliente.entity.Cliente;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClienteService {
    Mono<Cliente> save(Cliente cliente);
    Mono<Cliente> update(Cliente cliente);
    Mono<Void> deleteById(String id);
    Mono<Cliente> findById(String id);
    Flux<Cliente> findAll();
    
    Mono<Cliente> findByDni(String dni);
}
