package it.netgroup.data.dto;

import java.util.List;

public class ArticoliDTO {

	private String nomeArticolo;
	
	private Integer prezzo;
	
	private List<RecensioniDTO> recensioni;

	public String getNomeArticolo() {
		return nomeArticolo;
	}

	public void setNomeArticolo(String nomeArticolo) {
		this.nomeArticolo = nomeArticolo;
	}

	public Integer getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Integer prezzo) {
		this.prezzo = prezzo;
	}

	public List<RecensioniDTO> getRecensioni() {
		return recensioni;
	}

	public void setRecensioni(List<RecensioniDTO> recensioni) {
		this.recensioni = recensioni;
	}

	

	
	
	
	
	
	
	
}
