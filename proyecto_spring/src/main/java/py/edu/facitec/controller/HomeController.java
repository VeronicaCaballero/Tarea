package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//similar a una servelet
//trabajar con request y response
@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String index() {
	System.out.println("Cargando pagina de inicio");
	// el prefijo y sufijo se configuro dentro de aplication.properties	
		
	return "index";
		
	};
}
