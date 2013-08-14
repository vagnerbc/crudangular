package com.eits.crudangular.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Column;


@Entity
@Table(name="tarefas")
public class Tarefa implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	private boolean finalizado;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_finalizado", nullable = true)
	private Calendar dataFinalizacao;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isFinalizado() {
		return finalizado;
	}
	
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	
	

}
