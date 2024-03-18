package br.com.senac.domain;

import java.io.Serializable;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity <ID extends Serializable> implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return " id = " + id;
	}
	
	
	
}

// Serializable -> Automaticamente todas as filhas também
// terão que ter o ID como Serializable (Boa Prática).
// Tipo do ID, String, long, int...
// Classe filha informa qual o tipo da chave primária(ID)
// <> => diamonds
