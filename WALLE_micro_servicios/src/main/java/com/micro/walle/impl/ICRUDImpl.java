package com.micro.walle.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.walle.service.TrabajadorService;


public abstract class ICRUDImpl<T,ID> implements TrabajadorService<T, ID>{

	public abstract JpaRepository<T, ID> getRepository();
	
	
	

	@Override
	public List<T> listar() throws Exception {
		// TODO Auto-generated method stub
		return getRepository().findAll();
	}

	
	
	
	
}
