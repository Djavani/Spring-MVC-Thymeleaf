package com.djavani.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djavani.curso.boot.dao.CargoDao;
import com.djavani.curso.boot.domain.Cargo;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService{

	@Autowired
	private CargoDao dao;
	
	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
		
	}

	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
		
	}

	@Override
	public void exluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Cargo buscaPorId(Long id) {		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {		
		return dao.findAll();
	}

	@Override
	public boolean cargoTemFuncionarios(Long id) {
		if(buscaPorId(id).getFuncionarios().isEmpty()) {
			return false;			
		}
		return true;
	}

}
