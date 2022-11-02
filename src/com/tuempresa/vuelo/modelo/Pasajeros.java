 package com.tuempresa.vuelo.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pasajeros extends Identificable {
	
	@Column(length=6) 
	int numAsiento;
	
	@Money
	BigDecimal precio;
	
	
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@ElementCollection
    @ReferenceView("Simple")
    Persona persona;
}
