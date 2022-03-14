package com.bootcamp.microcliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.microcliente.entity.Cliente;
import com.bootcamp.microcliente.repository.IClienteRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteRepository _clienteRepo;
	

	@Override
	public Mono<Cliente> save(Cliente cliente) {
		return _clienteRepo.save(cliente);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return _clienteRepo.deleteById(id);
	}

	@Override
	public Mono<Cliente> findById(String id) {
		return _clienteRepo.findById(id);
	}

	@Override
	public Flux<Cliente> findAll() {
		return _clienteRepo.findAll();
	}

	@Override
	public Mono<Cliente> findByDni(String dni) {
		return _clienteRepo.findByDni(dni);
	}

	@Override
	public Mono<Cliente> update(Cliente cliente) {
		return _clienteRepo.save(cliente);
	}

}
