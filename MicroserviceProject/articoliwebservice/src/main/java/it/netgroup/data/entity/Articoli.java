package it.netgroup.data.entity;

import javax.persistence.*;

@Entity
public class Articoli {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idarticolo;
	
	private String nomeArticolo;
	
	private Integer prezzo;
	
	

	
	public Integer getIdarticolo() {
		return idarticolo;
	}

	public void setIdarticolo(Integer idarticolo) {
		this.idarticolo = idarticolo;
	}

	

	
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
	
//	private List<RecensioniDTO>;
	
	

}
