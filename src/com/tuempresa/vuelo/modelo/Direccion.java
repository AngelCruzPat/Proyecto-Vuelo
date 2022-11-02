package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Embeddable
@Getter @Setter
public class Direccion {
 
    @Column(length = 32)
    String calle;
 
    @Column(length = 5)
    String colonia;
 
    @Column(length = 20)
    String municipio;
 
    @Column(length = 30)
    String estado;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList
    Pais pais;
}