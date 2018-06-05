package com.djavani.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djavani.curso.boot.dao.FuncionarioDao;
import com.djavani.curso.boot.domain.Funcionario;

@Transactional(readOnly = true)
@Service
public class FuncionarioServiceImpl implements FuncionarioService{

	@Autowired
	private FuncionarioDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);		
	}

	@Transactional(readOnly = false)
	@Override
	public void exluir(Long id) {
		dao.delete(id);		
	}

	@Override
	public Funcionario buscaPorId(Long id) {		
		return dao.findById(id);
	}

	@Override
	public List<Funcionario> buscarTodos() {		
		return dao.findAll();
	}

}
