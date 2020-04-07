package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.model.Suscrito;
import py.edu.facitec.repository.SuscritoRepository;

@Controller
public class SuscritoControllerV1 {
	
	@Autowired
	public SuscritoRepository sucritoRepository;
	
	@RequestMapping("/formulario")
	public String acceder() {
		
		System.out.println("Accedio al formulario");
		
		return"suscrito/formulario";
	}
	
	@RequestMapping("/registrar")
										//request
	public String registrar(Suscrito  suscrito) {
		
		System.out.println("Accedio a registrar");
		
		sucritoRepository.save(suscrito);
		
		//response
		//retornar la siguientye pagina
		return "suscrito/formulario";
	}
	
	

}
