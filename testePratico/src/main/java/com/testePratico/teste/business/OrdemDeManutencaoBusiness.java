package com.testePratico.teste.business;

import java.util.List;

import com.testePratico.teste.dao.OrdemDeManutencaoDAO;
import com.testePratico.teste.interfaces.Business;
import com.testePratico.teste.model.OrdemDeManutencao;

public class OrdemDeManutencaoBusiness implements Business<OrdemDeManutencao>{

	private OrdemDeManutencaoDAO oDao = new OrdemDeManutencaoDAO();
	

	public void save(OrdemDeManutencao object) {
		oDao.save(object);
	}

	public void merge(OrdemDeManutencao object) {
		oDao.merge(object);
	}

	public void remove(OrdemDeManutencao object) {
		oDao.remove(object);
	}

	public List<OrdemDeManutencao> findAll() {
		return oDao.findAll();
	}

	public OrdemDeManutencao findById(Long id) {
		return oDao.findById(id);
	}

}
