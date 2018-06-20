package com.djavani.curso.boot.service;

import java.util.List;

import com.djavani.curso.boot.domain.Departamento;

public interface DepartamentoService {
	
	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void exluir(Long id);
	
	Departamento buscaPorId(Long id);
	
	List<Departamento> buscarTodos();

	boolean departamentoTemCargos(Long id);

}
