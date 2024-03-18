package br.com.senac.dao;

import br.com.senac.domain.Cargo;

public interface CargoDao {
	
	public void save(Cargo cargo);
	
	public void update(Cargo cargo);
	
	public void delet(Cargo cargo);
	
	public void findById(Cargo cargo);

}
