package br.com.senac.domain;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {
	
//	nullable-> true, unique -> false
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento; 
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
	// 1 departamento pode * cargos
	// 1 cargo pode ter * funcionarios
	// 1 endereço - 1 funcionário
	
}
