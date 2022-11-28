package com.cibertec.spring.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.cibertec.spring.soap.api.service.TrabajadorService;
import com.cibertec.spring.soap.api.serviciotrabajador.GetRolResponse;
import com.cibertec.spring.soap.api.serviciotrabajador.GetTrabajadoresResponse;
import com.cibertec.spring.soap.api.serviciotrabajador.PostTrabajadorRequest;
import com.cibertec.spring.soap.api.serviciotrabajador.PostTrabajadorResponse;



@Endpoint
public class TrabajadorEnpoint {

	@Autowired
	private TrabajadorService servicio;
	
	private static final String NAMESPACE = "http://www.cibertec.com/spring/soap/api/servicioTrabajador";
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "getRolRequest")
	@ResponsePayload
	public GetRolResponse salidaRol() {
		return servicio.rolResponse();
	}

	@PayloadRoot(namespace = NAMESPACE, localPart = "getTrabajadoresRequest")
	@ResponsePayload
	public GetTrabajadoresResponse salidaTrabajadores() {
		return servicio.trabajadorResponse();
	}
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "postTrabajadorRequest")
	@ResponsePayload
	public PostTrabajadorResponse salidaRegistrar(PostTrabajadorRequest request) {
		return servicio.registrarResponse(request.getTrabajador());
	}

	
}
