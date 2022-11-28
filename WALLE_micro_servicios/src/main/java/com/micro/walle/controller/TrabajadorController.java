package com.micro.walle.controller;

import com.micro.walle.entity.Trabajador;
import com.micro.walle.impl.TrabajadorServiceImp;
import com.micro.walle.utils.AppSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabajadores")
@CrossOrigin(origins = "*")
public class TrabajadorController {

    @Autowired
    TrabajadorServiceImp serviceTrabajador;


	@GetMapping("/listarTodos")
	public ResponseEntity<List<Trabajador>> listarTodos() throws Exception{
		List<Trabajador> lista=serviceTrabajador.listar();
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
//	public List<Trabajador> listarTodos() throws Exception{
//		
//	List<Trabajador> lista=serviceTrabajador.listar();
//		
//		return serviceTrabajador.listar();
//	}
	

	
}
