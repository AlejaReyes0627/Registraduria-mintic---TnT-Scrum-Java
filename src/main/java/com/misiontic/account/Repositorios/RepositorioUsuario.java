package com.misiontic.account.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.misiontic.account.Modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario,String>{

}
