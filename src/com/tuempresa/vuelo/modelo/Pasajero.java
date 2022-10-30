package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Setter @Getter
public class Pasajero {

	
	@Id @Column
    int asiento;
 
    @Column
    @Required
    float costo;
 
    @ManyToOne(fetch=FetchType.LAZY, optional=true)
    @Embedded
    Persona persona;
}
