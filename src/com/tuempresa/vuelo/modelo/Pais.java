package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Pais extends Identificable{
 
	
    @Column(length=64)
    String descripcion;
	
}
