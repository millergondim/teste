package com.testePratico.teste.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

import com.testePratico.teste.interfaces.Persist;
import com.testePratico.teste.model.Equipamento;

public class EquipamentoDAO implements Persist<Equipamento> {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
    EntityManager manager = factory.createEntityManager();
	
	@Override
	public void save(Equipamento object) {
		manager.persist(object);	
	}

	@Override
	public void merge(Equipamento object) {
		manager.merge(object);
	}

	@Override
	public void remove(Equipamento object) {
		manager.remove(object);
		
	}

	@Override
	public List<Equipamento> findAll() {
		return manager.createQuery("select e from Equipamento e ").getResultList();
	}

	@Override
	public Equipamento findById(Long id) {
		return manager.find(Equipamento.class, id);
	}
}
