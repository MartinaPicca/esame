package it.netgroup.data.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Recensioni {
	
	public static final String SEQUENCE_NAME = "recensioni_sequence";
    private long id; 
	
    @Field
  	private Integer idArticolo;
      @Field
  	private String nomeRecensione;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public String getNomeRecensione() {
		return nomeRecensione;
	}

	public void setNomeRecensione(String nomeRecensione) {
		this.nomeRecensione = nomeRecensione;
	}
  


	public Integer getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(Integer idArticolo) {
		this.idArticolo = idArticolo;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	
	
	
	
	
	
}
