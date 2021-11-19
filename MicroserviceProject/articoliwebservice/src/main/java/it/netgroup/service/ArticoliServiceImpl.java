package it.netgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.netgroup.converter.ArticoliConverter;
import it.netgroup.data.dto.ArticoliDTO;
import it.netgroup.data.entity.Articoli;
import it.netgroup.repository.ArticoliRepository;

@Service
public class ArticoliServiceImpl implements ArticoliService {

	@Autowired
	ArticoliRepository articoliRepository;
	
	@Autowired
	ArticoliConverter converter;
	
	public List<ArticoliDTO> findAll(){
		List<Articoli> articoli = articoliRepository.findAll();
		
	    List<ArticoliDTO> articoliDTO = converter.convertEntityToDto(articoli);
	    return articoliDTO;

		
	}
	
	public List<ArticoliDTO> findNomeArticolo(String nomeArticolo){
		
		List<Articoli> articoli = articoliRepository.findNomeArticolo(nomeArticolo);
		List<ArticoliDTO> articoliDTO = converter.convertFromEntityToDto(articoli);
		
		return articoliDTO;
	}
	
	
}

