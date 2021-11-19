package it.netgroup.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.netgroup.data.dto.RecensioniDTO;
import it.netgroup.data.entity.Recensioni;
import it.netgroup.service.RecensioniService;
@CrossOrigin
@RestController
@RequestMapping("/api/recensioni")
public class RestRecensioniController {
	
	@Autowired
	RecensioniService recser;
	
	@GetMapping("/getRecensioneById/{id}")
	public List<RecensioniDTO> getRecensioni(@PathVariable("id")long id) {
		
	
	return recser.findByIdArticolo(id);
	}
	
	 @PostMapping
	 public void createRecensione(@RequestBody Recensioni orecensioni) {

	        recser.salva(orecensioni);
	    }

	   
}
