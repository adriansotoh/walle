package com.cibertec.spring.soap.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cibertec.spring.soap.api.repository.TrabajadorRepository;
import com.cibertec.spring.soap.api.serviciotrabajador.GetRolResponse;
import com.cibertec.spring.soap.api.serviciotrabajador.GetTrabajadoresResponse;
import com.cibertec.spring.soap.api.serviciotrabajador.PostTrabajadorResponse;
import com.cibertec.spring.soap.api.serviciotrabajador.Trabajador;


@Service
public class TrabajadorService {

	@Autowired
	private TrabajadorRepository dao;
	
	public GetRolResponse rolResponse() {
		GetRolResponse salida=new GetRolResponse();
		salida.setLista(dao.listRol());
		return salida;
	}
	
	public GetTrabajadoresResponse trabajadorResponse() {
		GetTrabajadoresResponse salida=new GetTrabajadoresResponse();
		salida.setLista(dao.listTrabajador());
		return salida;
	}
	
	public PostTrabajadorResponse registrarResponse(Trabajador bean) {
		PostTrabajadorResponse salida=new PostTrabajadorResponse();
		int resu=dao.saveTrabajador(bean);
		salida.setSalida(resu);
		return salida;
	}

	
}
