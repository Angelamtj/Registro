package com.prueba.controller;
import com.prueba.entity.Usuario;
import com.prueba.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/registro")
public class RegistroController {
	
	@Autowired
	private RegistroService service;
	
	@PostMapping("/registrocliente")
	@CrossOrigin(origins ="*")
	public Usuario registroUsuario(@RequestBody Usuario usuario) throws Exception {
		
		String tempEmail = usuario.getEmail();
		
		if(tempEmail != null && !"".equals(tempEmail)) {
			
			Usuario clienteobj = service.fetchClienteByEmail(tempEmail);
			
			if(clienteobj != null ) {
				
				throw new Exception("Usuario con  "+ tempEmail + " ya existe");
			}
		}
		
		return service.saveCliente(usuario);
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins ="*")
	public Usuario loginCliente(@RequestBody Usuario usuario) throws Exception {
		
		String tempEmail = usuario.getEmail();
		
		String temppass = usuario.getPassword();
		
		Usuario clienteobj = null;
		
		if(tempEmail != null && temppass != null) {
			
			clienteobj = service.fetchClienteByEmailAndPassword(tempEmail, temppass);
		}
		
		if(clienteobj == null) {
			
			throw new Exception("Datos incorrectos");
		}
		
		return clienteobj;
	}
	
	

}
