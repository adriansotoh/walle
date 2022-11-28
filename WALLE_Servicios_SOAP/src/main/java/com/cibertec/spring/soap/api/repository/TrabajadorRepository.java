package com.cibertec.spring.soap.api.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.cibertec.spring.soap.api.serviciotrabajador.Rol;
import com.cibertec.spring.soap.api.serviciotrabajador.Trabajador;






@Repository
public class TrabajadorRepository {

	 @Autowired
     JdbcTemplate template;

	 public List<Rol> listRol(){
		 String sql="select *from rol";
		 
	        List<Rol> items = template.query(sql,
	        					(result,rowNum)->new Rol(result.getInt(1),result.getString(2)));
	        return items;
	 }
	 
	 public List<Trabajador> listTrabajador() {
		 String sql="select id_trabajador,r.id_rol,r.descripcion,nombres,apellidos,correo,t.descripcion,usuario,t.password from bd_walle.trabajador t join bd_walle.rol r on t.id_rol=r.id_rol";
		 
		 	List<Trabajador> items = template.query(sql,
		 			(result,rowNum)->new Trabajador(result.getInt(1), new Rol(result.getInt(2),result.getString(3)),result.getString(4),result.getString(5),
							result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10)));
			return items;
		}
	 
	 public int saveTrabajador(Trabajador t){
			String query="insert into trabajador values(null,?,?,?,?,?,?,?,?)";
			
			return template.update(query,t.getRol().getId(),t.getDocumento(),t.getNombres(),t.getApellidos(),t.getCorreo(),t.getDescripcion(),t.getUsuario(),t.getPassword());
	 }

	 
}



