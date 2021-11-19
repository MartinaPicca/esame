package it.netgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.netgroup.service.*;
import it.netgroup.data.dto.RecensioniDTO;
import it.netgroup.data.entity.Recensioni;
import it.netgroup.repository.RecensioniRepository;

@Service
public class RecensioniServiceImpl implements RecensioniService {
	
	@Autowired
	RecensioniRepository recensioniRepository;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;
	
	public List<RecensioniDTO> findByIdArticolo(long id){
		return recensioniRepository.findByIdArticolo(id);
		
		
	}

	@Override
	public void salva(Recensioni orecensioni) {
		orecensioni.setId(sequenceGeneratorService.generateSequence(Recensioni.SEQUENCE_NAME));
		recensioniRepository.save(orecensioni);
		
	}

	
}
