package it.netgroup.service;

import java.util.List;

import it.netgroup.data.dto.RecensioniDTO;
import it.netgroup.data.entity.Recensioni;

public interface RecensioniService {

	 List<RecensioniDTO> findByIdArticolo(long id);

	void salva(Recensioni orecensioni);

	

}
