package com.eits.crudangular.controller;

import java.util.List;





import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eits.crudangular.model.Tarefa;
import com.eits.crudangular.model.TarefaDao;



@Controller
public class TarefasController {

	@Autowired
	TarefaDao dao;
	
	
	
	@RequestMapping(value="/home")
	public String home() {
		return "index";
	}
	
	
	
	@Transactional
	@ResponseBody
	@RequestMapping(value="adicionaTarefa", method=RequestMethod.POST)
	public String adiciona(@RequestBody Tarefa tarefa) {
		dao.adiciona(tarefa);
		return "ok";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/listaTarefas", method=RequestMethod.GET)
	public List<Tarefa> lista() {
		return dao.lista();
	}
	
	
	@Transactional
	@ResponseBody
	@RequestMapping("removeTarefa")
	public String remove(@RequestBody Tarefa tarefa) {
		dao.remove(tarefa);
		return "ok";
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
	
	
	@Transactional
	@ResponseBody
	@RequestMapping("finalizaTarefa")
	public String finaliza(@RequestBody Long id) {
		dao.finaliza(id);
		return "ok";
	}
	
}
