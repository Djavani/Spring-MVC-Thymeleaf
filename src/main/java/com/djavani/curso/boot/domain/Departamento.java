package com.djavani.curso.boot.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	public String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargo;

	public List<Cargo> getCargo() {
		return cargo;
	}

	public void setCargo(List<Cargo> cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
