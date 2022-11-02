package com.tuempresa.vuelo.validadores;

import org.openxava.util.*;
import org.openxava.validators.*;

import com.tuempresa.vuelo.modelo.*;

public class ValidadorBorraVuelo implements IRemoveValidator{

	private Vuelos vuelos;
	
	public void setEntity(Object entity) throws Exception {
		 this.vuelos = (Vuelos) entity;
		
	}
	
	public void validate(Messages errors) throws Exception {
		if (vuelos.getFecha() != null) {
            errors.add("no_puede_borrar_vuelo_con_destino");
        }
	}

}
