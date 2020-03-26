package com.testePratico.teste.controller;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestBody;

import com.testePratico.teste.business.EquipamentoBusiness;
import com.testePratico.teste.interfaces.Controller;
import com.testePratico.teste.model.Equipamento;
@Path("/equipamento")
public class EquipamentoController implements Controller<Equipamento> {

	private EquipamentoBusiness eb = new EquipamentoBusiness();
	@POST
	@Path("/salvar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(@RequestBody Equipamento object) {
		eb.save(object);
	}

	@POST
	@Path("/atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void merge(Equipamento object) {
		eb.merge(object);
	}

	@POST
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove(Equipamento object) {
		eb.remove(object);
	}

	@GET
	@Path("/listar")
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Equipamento> findAll() {		
		return eb.findAll();
	}

	@GET
	@Path("/buscar/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Equipamento findById(@PathParam("id") Long id) {
		return eb.findById(id);
	}

}
