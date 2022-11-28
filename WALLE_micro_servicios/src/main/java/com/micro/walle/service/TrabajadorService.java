package com.micro.walle.service;

import java.util.List;

import com.micro.walle.entity.Trabajador;

public interface TrabajadorService<T,ID> {
	
//	public abstract List<Trabajador> listar();

	List<T> listar() throws Exception;
	
	
	
}
