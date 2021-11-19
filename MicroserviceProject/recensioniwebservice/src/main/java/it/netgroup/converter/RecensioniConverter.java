package it.netgroup.converter;

import it.netgroup.data.dto.RecensioniDTO;
import it.netgroup.data.entity.Recensioni;

public class RecensioniConverter {
	
	public static RecensioniDTO convertFromDaoToDto(Recensioni orecensioni) {
        RecensioniDTO orecensionidto = new RecensioniDTO();
        orecensionidto.setNomeRecensione(orecensioni.getNomeRecensione());
  
        return orecensionidto;
    }

}
