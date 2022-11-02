package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity @Getter @Setter
@View(name="Simple",
members="nombre;"
		+ "apellido;" 
)
public class Persona extends Identificable{
	
	@Column(length=32) @Required
	String nombre;
    
    @Column(length=64)
    String apellido;
    
    @File
    @Column(length=32)
    String fotografia;
    
    @Embedded
    private Direccion direccion;

}