package com.testePratico.teste.interfaces;

import java.util.List;

public interface Controller<T> {

	public void save(T object);
	
	public void merge(T object);
	
	public void remove(T object);
	
	public List<T> findAll();
	
	public T findById(Long id);
}
