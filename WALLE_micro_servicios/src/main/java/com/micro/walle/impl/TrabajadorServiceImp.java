package com.micro.walle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.micro.walle.entity.Trabajador;
import com.micro.walle.repository.TrabajadorRepository;
import com.micro.walle.service.TrabajadorService;

@Service
public class TrabajadorServiceImp extends ICRUDImpl<Trabajador, Integer> {


	@Autowired
	TrabajadorRepository repo;
	
//	@Override
//	public List<Trabajador> listar() {
//		return repo.findAll();
//	}

	@Override
	public JpaRepository<Trabajador, Integer> getRepository() {
		// TODO Auto-generated method stub
		return repo;
	}


	

}
