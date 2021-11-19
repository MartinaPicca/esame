package it.netgroup.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import it.netgroup.data.dto.RecensioniDTO;
import it.netgroup.data.entity.Recensioni;

public interface RecensioniRepository extends MongoRepository<Recensioni, Integer>{

	List<RecensioniDTO> findByIdArticolo(long id);
	
}
