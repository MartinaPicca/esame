package it.netgroup.service;

import java.util.List;

import it.netgroup.data.dto.ArticoliDTO;
import it.netgroup.data.entity.Articoli;

public interface ArticoliService {

	 List<ArticoliDTO> findAll();

	List<ArticoliDTO> findNomeArticolo(String nomeArticolo);
		
	

}
