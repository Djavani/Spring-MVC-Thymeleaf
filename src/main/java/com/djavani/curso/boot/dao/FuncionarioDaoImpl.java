package com.djavani.curso.boot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.djavani.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractoDao<Funcionario, Long>  implements FuncionarioDao{

	
	public List<Funcionario> findByNome(String nome) {
		/*TypedQuery<Funcionario> query = getEntityManager()
				.createQuery("select f from Funcionario f where f.nome like :nome", Funcionario.class);
		query.setParameter("nome", nome);*/
		
		//metodo criado em abstractDAO
		return createQuery("select f from Funcionario f where f.nome like concat('%', ?1, '%')", nome);
	}	

}
