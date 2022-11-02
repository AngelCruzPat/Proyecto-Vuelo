 package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Tripulacion extends Identificable {
	
	@Column(length=32) @Required
	String nombre;
	
	@Column(length=6) 
	int elementos;
	
}
