package com.djavani.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.djavani.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractoDao<Funcionario, Long>  implements FuncionarioDao{

}
