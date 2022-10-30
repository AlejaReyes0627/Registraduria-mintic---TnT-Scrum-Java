package com.misiontic.account.Modelos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
//Se hace el import del DBRef para realizar realxion de uno a muchos//
import org.springframework.data.mongodb.core.mapping.DBRef; 
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document()
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	@Id
	private String _id;
	private String pseudonimo;
	private String correo;
	private String contrasena;
	//Se crea un parametro de tip rol con la anotacion DBRef//
	@DBRef
	private Rol rol;
	
	public Usuario(String pseudonimo, String correo, String contrasena) {
		super();
		this.pseudonimo = pseudonimo;
		this.correo = correo;
		this.contrasena = contrasena;
	}

	public String get_id() {
		return _id;
	}

	public String getPseudonimo() {
		return pseudonimo;
	}

	public void setPseudonimo(String pseudonimo) {
		this.pseudonimo = pseudonimo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
//Implementacio de metodos get y set para el atributo Rol//
	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
