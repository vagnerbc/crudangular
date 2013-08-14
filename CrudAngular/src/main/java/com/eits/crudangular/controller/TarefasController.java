package com.eits.crudangular.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eits.crudangular.model.Tarefa;
import com.eits.crudangular.model.TarefaDao;



@Controller
public class TarefasController {

	@Autowired
	TarefaDao dao;
	
	
	@Transactional
	@RequestMapping("adicionaTarefa")
	public void adiciona(@RequestBody Tarefa tarefa) {
		dao.adiciona(tarefa);
	}
	
	
	@ResponseBody
	@RequestMapping("listaTarefas")
	public List<Tarefa> lista() {
		return dao.lista();
	}
	
	
	@Transactional
	@RequestMapping("removeTarefa")
	public void remove(@RequestBody Tarefa tarefa) {
		dao.remove(tarefa);
	}
	
	
	@RequestMapping("mostraTarefa")
	public Tarefa mostra(Long id, Model model) {
		return dao.buscaPorId(id);
	}
	
	
	@Transactional
	@RequestMapping("alteraTarefa")
	public void altera(@RequestBody Tarefa tarefa) {
		dao.altera(tarefa);
	}
	
	
	
	@RequestMapping("finalizaTarefa")
	public void finaliza(Long id, Model model) {
		dao.finaliza(id);
	}
	
}
