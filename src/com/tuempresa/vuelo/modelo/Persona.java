package com.tuempresa.vuelo.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Setter @Getter
public class Persona {

	@Id
    @Hidden
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
	String oid;
	
	@Column(length=64)
    @Required
    String nombres;
	
	@Column(length=64)
    @Required
    String apellidos;
	
	@Column(length=64)
    String pais;

	@Column(length=64)
	@File
    String fotografia;
	
	@Embedded @NoFrame
    Direccion direccion;
}
