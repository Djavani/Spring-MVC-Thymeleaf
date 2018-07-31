package com.djavani.curso.boot.dao;

import java.time.LocalDate;
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

	@Override
	public List<Funcionario> findByCargoId(Long id) {
		return createQuery("select f from Funcionario f where f.cargo.id = ?1", id);
	}

	@Override
	public List<Funcionario> findByDataEntradadataSaida(LocalDate entrada, LocalDate saida) {
		String jpql = new StringBuilder("SELECT f FROM Funcionario f ")
				.append(" WHERE f.dataEntrada >= ?1 AND f.dataSaida <= ?2 ")
				.append("ORDER BY f.dataEntrada ASC")
				.toString();
		return createQuery(jpql, entrada, saida);
	}

	@Override
	public List<Funcionario> findByDataEntrada(LocalDate entrada) {
		String jpql = new StringBuilder("SELECT f FROM Funcionario f ")
				.append(" WHERE f.dataEntrada = ?1 ")
				.append("ORDER BY f.dataEntrada ASC")
				.toString();
		return createQuery(jpql, entrada);
	}

	@Override
	public List<Funcionario> findByDataSaida(LocalDate saida) {
		String jpql = new StringBuilder("SELECT f FROM Funcionario f ")
				.append(" WHERE f.dataSaida <= ?1 ")
				.append("ORDER BY f.dataSaida ASC")
				.toString();
		return createQuery(jpql, saida);
	}	

}
