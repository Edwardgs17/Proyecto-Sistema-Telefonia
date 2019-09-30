package com.ronaldarias.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldarias.apirest.models.entity.EquiposVO;
import com.ronaldarias.apirest.models.entity.FacturaVO;
import com.ronaldarias.apirest.models.entity.LineasVO;
import com.ronaldarias.apirest.models.entity.PersonasVO;
import com.ronaldarias.apirest.models.service.EquiposServicios;
import com.ronaldarias.apirest.models.service.FacturaServicio;
import com.ronaldarias.apirest.models.service.LineasService;
import com.ronaldarias.apirest.models.service.PersonasService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class SistemaRestController {

	@Autowired
	private PersonasService personasService;
	
	@Autowired
	private EquiposServicios equiposServicio;
	
	@Autowired
	private LineasService miLineaService;
	
	@Autowired
	private FacturaServicio miFacturaService;
	

	@GetMapping("/personas")
	public List<PersonasVO> getPersonas() {
		return personasService.getPersonas();
	}

	@GetMapping("/personas/{documento}")
	public PersonasVO getPersonas(@PathVariable int documento) {

		PersonasVO miPersona = personasService.getPersona(documento);

		return miPersona;
	}



	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonasVO agregarPersonas(@RequestBody PersonasVO miPersona) {

	
		personasService.savePersonas(miPersona);

		return miPersona;
	}
	
	
	@PutMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonasVO actualizarPersonas(@RequestBody PersonasVO miPersona) {
		
		personasService.savePersonas(miPersona);
		
		return miPersona;
	}
	
	
	@DeleteMapping("/personas/{documento}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable int documento) {
		
		personasService.deletePersona(documento);
	}
	
	//Metodos de acceso equipos
	
	@GetMapping("/equipos")
	public List<EquiposVO> getEquipos(){
		
		return equiposServicio.getEquipos();
	}

	@GetMapping("/equipos/{imei}")
	public EquiposVO getEquipos(@PathVariable int imei) {

		EquiposVO miEquipo = equiposServicio.getEquipos(imei);

		return miEquipo;
	}

	@PostMapping("/equipos")
	@ResponseStatus(HttpStatus.CREATED)
	public EquiposVO agregarEquipo(@RequestBody EquiposVO miEquipo) {

	

		equiposServicio.guardarEquipos(miEquipo);

		return miEquipo;
	}
	
	
	@PutMapping("/equipos")
	@ResponseStatus(HttpStatus.CREATED)
	public EquiposVO actualizarEquipo(@RequestBody EquiposVO miEquipo) {
		
		equiposServicio.guardarEquipos(miEquipo);
		
		return miEquipo;
	}
	
	
	@DeleteMapping("/equipos/{imei}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarEquipo(@PathVariable int imei) {
		
		equiposServicio.eliminarEquipos(imei);
	}
	
	//Metodos de acceso lineas
	
	@GetMapping("/lineas")
	public List<LineasVO> getLineas(){
		
		return miLineaService.getLineas();
	}

	@GetMapping("/lineas/{numeroLinea}")
	public LineasVO getLineas(@PathVariable int numeroLinea) {

		LineasVO miLinea = miLineaService.getLineas(numeroLinea);

		return miLinea;
	}

	@PostMapping("/lineas")
	@ResponseStatus(HttpStatus.CREATED)
	public LineasVO agregarLinea(@RequestBody LineasVO miLinea) {

	

		miLineaService.guardarLineas(miLinea);

		return miLinea;
	}
	
	@DeleteMapping("/lineas/{numeroLinea}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarLinea(@PathVariable int numeroLinea) {
		
		miLineaService.eliminarLinea(numeroLinea);
	}

	//Metodos de acceso a facturas
	
	@GetMapping("/facturas")
	public List<FacturaVO> getFacturas(){
		
		return miFacturaService.getFactura();
	}

	@GetMapping("/facturas/{idFactura}")
	public FacturaVO getFacturas(@PathVariable int idFactura) {

		FacturaVO miFactura = miFacturaService.getFactura(idFactura);

		return miFactura;
	}

	@PostMapping("/facturas")
	@ResponseStatus(HttpStatus.CREATED)
	public FacturaVO registrarFactura(@RequestBody FacturaVO miFactura) {

	

		miFacturaService.registrarFactura(miFactura);

		return miFactura;
	}
	
	@DeleteMapping("/facturas/{idFactura}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarFactura(@PathVariable int idFactura) {
		
		miFacturaService.eliminarFactura(idFactura);
	}

}
