package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity @Getter @Setter

public class Persona extends Identificable{
 
 
    @Column(length=64)
    String nombre;
    
    @Column(length=64)
    String apellido;
    
    @File
    @Column(length=32)
    String fotografia;
    
    @Embedded @NoFrame
    private Direccion direccion;

}