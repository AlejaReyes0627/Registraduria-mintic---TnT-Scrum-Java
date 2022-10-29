package com.misiontic.account.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.misiontic.account.Modelos.Rol;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}