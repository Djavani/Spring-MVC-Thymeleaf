package com.djavani.curso.boot.dao;

import java.util.List;

import com.djavani.curso.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcrionario);
	
	void update (Funcionario funcrionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
