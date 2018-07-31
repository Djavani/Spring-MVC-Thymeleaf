package com.djavani.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

import com.djavani.curso.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);
	
	void update (Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();

	List<Funcionario> findByNome(String nome);

	List<Funcionario> findByCargoId(Long id);

	List<Funcionario> findByDataEntradadataSaida(LocalDate entrada, LocalDate saida);

	List<Funcionario> findByDataEntrada(LocalDate entrada);

	List<Funcionario> findByDataSaida(LocalDate saida);
}
