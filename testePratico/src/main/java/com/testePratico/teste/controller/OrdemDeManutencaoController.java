package com.testePratico.teste.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.testePratico.teste.business.OrdemDeManutencaoBusiness;
import com.testePratico.teste.interfaces.Controller;
import com.testePratico.teste.model.OrdemDeManutencao;

@Path("/ordemdemanutencao")
public class OrdemDeManutencaoController implements Controller<OrdemDeManutencao>{

	private OrdemDeManutencaoBusiness omb = new OrdemDeManutencaoBusiness();
	
	@POST
	@Path("/salvar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(OrdemDeManutencao object) {
		omb.save(object);
	}

	@POST
	@Path("/atualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void merge(OrdemDeManutencao object) {
		omb.merge(object);
	}

	@POST
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove(OrdemDeManutencao object) {
		omb.remove(object);
	}

	@GET
	@Path("/listar")
	@Consumes(MediaType.APPLICATION_JSON)
	public List<OrdemDeManutencao> findAll() {
		return omb.findAll();
	}

	@GET
	@Path("/buscar/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public OrdemDeManutencao findById(@PathParam("id") Long id) {
		return omb.findById(id);
	}
}
