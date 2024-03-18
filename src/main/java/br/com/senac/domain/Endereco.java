package br.com.senac.domain;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {
	
	@Column(nullable = false) 
	private String bairro;
	
	@Column(nullable = false, length = 9) 
	private String cep;
	
	@Column(nullable = false) 
	private String cidade;
	
	private String complemento; 
	
	@Column(nullable = false) 
	private String logradouro;
	
	@Column(nullable = false, length = 5)
	private int numero;
	
	
}
