package com.misiontic.account.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.misiontic.account.Modelos.Usuario;
import org.springframework.data.mongodb.repository.Query;

public interface RepositorioUsuario extends MongoRepository<Usuario,String>{
	@Query("{'correo': ?0}")
	public Usuario getUserByEmail(String correo);

}
