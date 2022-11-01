package com.tuempresa.vuelo.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;
import org.openxava.util.*;

import lombok.*;

@Entity @Getter @Setter
public class Vuelos extends Identificable{

	
	@Column(length=4)
    @DefaultValueCalculator(CurrentYearCalculator.class)
    int anyo;
	
	@Column(length=32)
	String ciudadOrigen;
	
	@Column(length=32)
	String ciudadDestino;
	
	LocalDate fecha;
	
	@StringTime
	@Column(length=5)
	String hora;
	
	@PreRemove
	private void validarPreBorrar() {
	    if (ciudadDestino != null) {
	        throw new javax.validation.ValidationException(
	            XavaResources.getString(
	                "no_puede_borrar_vuelo_con_destino"));
	    }
	}

	
}
