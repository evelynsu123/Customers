package com.bootcamp.microcliente.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Cliente{

	private String name;
	private String lastName;
	private String dni;
	private String type; // personal y business
	
}
