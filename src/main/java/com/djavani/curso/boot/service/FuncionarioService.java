package com.djavani.curso.boot.service;

import java.util.List;

import com.djavani.curso.boot.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void exluir(Long id);
	
	Funcionario buscaPorId(Long id);
	
	List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	List<Funcionario> buscarPorCargo(Long id);
}
