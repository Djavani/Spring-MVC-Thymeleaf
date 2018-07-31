package com.djavani.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
	
	@NotBlank(message="Informe um nome.")
	@Size(min=3, max=60, message="O nome do departamento deve ter entre {min} e {max} caracteres.")
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
