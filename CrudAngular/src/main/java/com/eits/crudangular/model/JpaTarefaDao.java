package com.eits.crudangular.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class JpaTarefaDao implements TarefaDao {
	
	
	@PersistenceContext
	private EntityManager manager;
	
	
	//sem construtor
	
	
	
	public void adiciona(Tarefa tarefa) {
		manager.persist(tarefa);	
	}
	
	
	@Transactional
	public void altera(Tarefa tarefa) {
		manager.merge(tarefa);
	}
	
	
	public List<Tarefa> lista() {
		return manager.createQuery("select t from Tarefa t").getResultList();
	}
	
	
	public Tarefa buscaPorId(Long id) {
		return manager.find(Tarefa.class, id);
	}
	
	
	public void remove(Tarefa tarefa) {
		Tarefa tarefaARemover = buscaPorId(tarefa.getId());
		manager.remove(tarefaARemover);
	}
	
	
	@Transactional
	public void finaliza(Long id) {
		Tarefa tarefa = buscaPorId(id);
		tarefa.setFinalizado(true);
		tarefa.setDataFinalizacao(Calendar.getInstance());
		manager.merge(tarefa);
	}
	
	

}
