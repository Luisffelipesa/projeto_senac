package br.com.senac.dao;

import java.io.Serializable;

import jakarta.persistence.EntityManager;


public abstract class AbstractDao <T, PK extends Serializable>{
	
	
	private EntityManager entityManager;
	//private Class entityClass;
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void save(T entity) {
		entityManager.persist(entity);
		
	}
	
	public void update(T entity) {
		entityManager.merge(entity);
		
	}
	
	public void delet(T entity) {
		//entityManager.remove(entityManager.getReference(entityClass, id));
		
	}
	
	public void findById(T entity) {
		
		
	}
}
