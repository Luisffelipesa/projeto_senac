package br.com.senac.dao;

import br.com.senac.domain.Funcionario;

public interface FuncionarioDao {
	
    public void save(Funcionario funcionario);
	
	public void update(Funcionario funcionario);
	
	public void delet(Funcionario funcionario);
	
	public void findById(Funcionario funcionario);

}
