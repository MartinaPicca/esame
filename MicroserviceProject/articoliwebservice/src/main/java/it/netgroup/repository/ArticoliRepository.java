package it.netgroup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.netgroup.data.dto.ArticoliDTO;
import it.netgroup.data.entity.Articoli;

public interface ArticoliRepository extends JpaRepository<Articoli, Integer> {

//@Query(value = "select nomeArticolo FROM Articoli a WHERE a.nomeArticolo =?1 ")
//List<Articoli> findNomeArticolo(String nomeArticolo);
//
	@Query(value = "select a From Articoli a  ")
	List<Articoli> findNomeArticolo(String nomeArticolo);
}
