package br.com.exemplo.model.entity;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Table(name="aluno")
public class Aluno {
    // Atributos
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ra;
	
	@Column(name="nome")
	private String nome;
	private String email;
	private String endereco;
	private Date dataNascimento;
	private String periodo;
	
	//Construtor padrão sem argumentos
	public Aluno() {
		
	}
	
	//Construtores
	public Aluno(int ra, String nome, String email, String endereco, Date dataNascimento, String periodo) {
		this.ra = ra;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.periodo = periodo;
	}
	
	
	//Getters e Setters
	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}
