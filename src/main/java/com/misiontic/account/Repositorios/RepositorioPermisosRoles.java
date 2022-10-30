package com.misiontic.account.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.misiontic.account.Modelos.PermisosRoles;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String > {

}
