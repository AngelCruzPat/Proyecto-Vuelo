package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import lombok.*;
 
@Embeddable
@Getter @Setter
public class Direccion {
 
    @Column(length = 32)
    String calle;
 
    @Column(length = 32)
    String colonia;
 
    @Column(length = 32)
    String municipio;
 
    @Column(length = 32)
    String estado;
    
    @Column(length = 32)
    String pais;
}