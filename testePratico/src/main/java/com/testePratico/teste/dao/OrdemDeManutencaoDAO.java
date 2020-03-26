package com.testePratico.teste.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.testePratico.teste.interfaces.Persist;
import com.testePratico.teste.model.OrdemDeManutencao;

public class OrdemDeManutencaoDAO implements Persist<OrdemDeManutencao>{

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
    EntityManager manager = factory.createEntityManager();
    
	@Override
	public void save(OrdemDeManutencao object) {
		manager.persist(object);	
	}

	@Override
	public void merge(OrdemDeManutencao object) {
		manager.merge(object);
	}

	@Override
	public void remove(OrdemDeManutencao object) {
		manager.remove(object);
	}

	@Override
	public List<OrdemDeManutencao> findAll() {
		return manager.createQuery("select o from OrdemDeManutencao o ").getResultList();
	}

	@Override
	public OrdemDeManutencao findById(Long id) {
		return manager.find(OrdemDeManutencao.class, id);
	}

}
