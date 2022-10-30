package com.misiontic.account.Modelos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//hola
@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Rol {
    @Id
    private String _id;
    private String nombre;

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    public String get_id() {
        return _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
    
    
    
