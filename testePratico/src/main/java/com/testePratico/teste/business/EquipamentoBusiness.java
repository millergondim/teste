package com.testePratico.teste.business;

import java.util.List;

import com.testePratico.teste.dao.EquipamentoDAO;
import com.testePratico.teste.interfaces.Business;
import com.testePratico.teste.model.Equipamento;

public class EquipamentoBusiness implements Business<Equipamento> {

	private EquipamentoDAO eDao = new EquipamentoDAO();
	
	public void save(Equipamento object) {
		eDao.save(object);
	}

	public void merge(Equipamento object) {
		eDao.merge(object);
	}

	public void remove(Equipamento object) {
		eDao.remove(object);
	}

	public List<Equipamento> findAll() {
		return eDao.findAll();
	}

	public Equipamento findById(Long id) {
		return eDao.findById(id);
	}

}
