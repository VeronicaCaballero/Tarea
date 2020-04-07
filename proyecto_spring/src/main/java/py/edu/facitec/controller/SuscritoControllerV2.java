package py.edu.facitec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//utilizando arquitectura rets

import py.edu.facitec.model.Suscrito;
import py.edu.facitec.repository.SuscritoRepository;
@RestController
//atiende requisiscionews
@RequestMapping("/suscritos")
public class SuscritoControllerV2 {

	@Autowired
	private SuscritoRepository suscritoRepository;
	@GetMapping
	 public List<Suscrito> getSuscritos(){
		 System.out.println("Listando elementos java a json");
		 
		 return suscritoRepository.findAll();
	 }
	
	//suscritos/3
	@GetMapping ("/{codigo}")
											//cargar la url de arriba al codigo
	 public Optional<Suscrito> getSuscrito(@PathVariable Long codigo){
		System.out.println("recuperANDO un elemento java a json");
		 Optional<Suscrito> retorno=suscritoRepository.findById(codigo);
		 return retorno;
	 }
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminarSuscrito(@PathVariable Long codigo) {
		suscritoRepository.deleteById(codigo);
		System.out.println("URL/suscritos/eliminar/3");
	}
	@PostMapping
	public Suscrito guardar(@RequestBody Suscrito suscrito){
		System.out.println("convercion de json a java");
		Suscrito retorno=
		suscritoRepository.save(suscrito);
		return retorno;
	}
	
}
