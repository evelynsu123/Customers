package com.bootcamp.microcliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.microcliente.entity.Cliente;
import com.bootcamp.microcliente.service.IClienteService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/customer")
public class ClienteController {
	
	@Autowired
	private IClienteService _clienteService;
	
	@PostMapping
	public Mono<Cliente> create(@RequestBody Cliente cliente){
		return _clienteService.save(cliente);
	}
	
	@PutMapping
	public Mono<Cliente> update(@RequestBody Cliente cliente){
		return _clienteService.update(cliente);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable("id") String id){
		return _clienteService.deleteById(id);
	}
	
	@GetMapping("/{dni}")
	public Mono<Cliente> findByDni(@PathVariable("dni") String dni){
		return _clienteService.findByDni(dni);
	}
	
	@GetMapping
	public Flux<Cliente> getAll(){
		return _clienteService.findAll();
	}
	
	
	

}
