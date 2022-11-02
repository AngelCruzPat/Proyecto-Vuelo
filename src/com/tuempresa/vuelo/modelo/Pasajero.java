package com.tuempresa.vuelo.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter

@View(members=
"anyo, fecha," +
   "datos{" +
	"asiento;" +
	"persona;" +
	"}"
	)
public class Pasajero {
	
	@Id
    @GeneratedValue(generator="system-uuid")
    @Hidden
    @GenericGenerator(name="system-uuid", strategy="uuid")
    @Column(length=32)
    String oid;
	
	
    @Embedded
    private Asiento asiento;

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    Persona persona;
    
    

}
