/*** 
 */
package com.misiontic.account.Repositorios;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.misiontic.account.Modelos.Permiso;


/**
 * @author Usuario'Alix
 *
 */
public interface RepositorioPermiso extends MongoRepository<Permiso,String>{
	@Query("{'url':?0,'metodo':?1}")
	Permiso getPermiso(String url, String metodo);
}
