package com.djavani.curso.boot.service;

import java.util.List;

import com.djavani.curso.boot.domain.Cargo;

public interface CargoService {
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void exluir(Long id);
	
	Cargo buscaPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id);

}
