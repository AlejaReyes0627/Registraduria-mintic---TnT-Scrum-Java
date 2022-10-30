package com.misiontic.account.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
//Se hace el import del DBRef para realizar realxion de uno a muchos//
import org.springframework.data.mongodb.core.mapping.DBRef; 
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document()

public class Usuario {
	@Id
	private String _id;
	private String seudonimo;
	private String correo;
	private String contrasena;
	//Se crea un parametro de tip rol con la anotacion DBRef//
	@DBRef
	private Rol rol;
	
	public Usuario(String seudonimo, String correo, String contrasena) {
		super();
		this.seudonimo = seudonimo;
		this.correo = correo;
		this.contrasena = contrasena;
	}

	public String get_id() {
		return _id;
	}

	public String getSeudonimo() {
		return seudonimo;
	}

	public void setSeudonimo(String seudonimo) {
		this.seudonimo = seudonimo;
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
//Imp´lementacio de metodos get y set para el atributo Rol//
	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
