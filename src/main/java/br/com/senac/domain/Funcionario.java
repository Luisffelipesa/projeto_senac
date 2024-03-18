package br.com.senac.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "salario", columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;

	@Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@Column(name = "data_saida", columnDefinition = "DATE")
	private LocalDate dataSaida;
	
	
	@ManyToOne
	@JoinColumn(name = "id_cargo_fk")
	private Cargo cargo; 
	
	@OneToOne
	@JoinColumn(name = "id_endereco_fk")
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
}
