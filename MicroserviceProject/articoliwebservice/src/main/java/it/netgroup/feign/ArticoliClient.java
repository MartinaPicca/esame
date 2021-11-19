package it.netgroup.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import it.netgroup.data.dto.RecensioniDTO;

@FeignClient(name = "RecensioniService", url = "http://localhost:8080")
public interface ArticoliClient {

	@GetMapping(value = "/api/recensioni/getRecensioneById/{id}")
	public List<RecensioniDTO> getRecensioniByRecensioniWebService(@PathVariable("id") Integer idArticolo);
		
}
