package com.tuempresa.vuelo.modelo;

import java.sql.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;


@Entity @Getter @Setter
public class Vuelo extends Identificable{

	@Column(length=4)
    @DefaultValueCalculator(CurrentYearCalculator.class)
    int anyo;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList
    Pais pais;
	
	@Column(length=9)
	String paisDestino;
	
	LocalDate fecha;
	
	@StringTime
	@Column(length=5)
	Time hora;
	
}
