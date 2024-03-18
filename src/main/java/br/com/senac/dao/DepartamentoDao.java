package br.com.senac.dao;

import br.com.senac.domain.Departamento;

public interface DepartamentoDao {
	
    public void save(Departamento departamento);
	
	public void update(Departamento departamento);
	
	public void delet(Departamento departamento);
	
	public void findById(Departamento departamento);

}
