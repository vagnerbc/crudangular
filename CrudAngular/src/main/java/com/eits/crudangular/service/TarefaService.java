package com.eits.crudangular.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

import com.eits.crudangular.model.JpaTarefaDao;
import com.eits.crudangular.model.Tarefa;


@Service
public class TarefaService {

	@Autowired
	JpaTarefaDao dao;
	

	public void adiciona(Tarefa tarefa) {
		dao.adiciona(tarefa);
	}
	
	

	public void altera(Tarefa tarefa) {
		dao.altera(tarefa);
	}
	

	public List<Tarefa> lista() {
		return dao.lista();
	}
	

	public Tarefa buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}
	

	public void remove(Tarefa tarefa) {
		dao.remove(tarefa);
	}
	
	

	public void finaliza(Long id) {
		dao.finaliza(id);
	}
}
