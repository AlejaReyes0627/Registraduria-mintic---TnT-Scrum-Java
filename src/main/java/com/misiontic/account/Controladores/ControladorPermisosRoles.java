package com.misiontic.account.Controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.misiontic.account.Modelos.*;
/*import com.misiontic.account.Modelos.Permiso;
import com.misiontic.account.Modelos.PermisosRoles;
import com.misiontic.account.Modelos.Rol;*/
import com.misiontic.account.Repositorios.*;
//import com.misiontic.account.Repositorios.RepositorioPermiso;
//import com.misiontic.account.Repositorios.RepositorioPermisosRoles; 
//import com.misiontic.account.Repositorios.RepositorioRol;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/permisos-roles")
public class ControladorPermisosRoles {

	@Autowired
	private RepositorioPermisosRoles miRepositorioPermisoRoles;

	@Autowired
	private RepositorioPermiso miRepositorioPermiso;

	@Autowired
	private RepositorioRol miRepositorioRol;

	@GetMapping("")
	public List<PermisosRoles> index(){
		return this.miRepositorioPermisoRoles.findAll();
	}

	/**
	 * Asignación rol y permiso
	 * @param id_rol
	 * @param id_permiso
	 * @return
	 */

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("rol/{id_rol}/permiso/{id_permiso}")
	public PermisosRoles create(@PathVariable String id_rol,@PathVariable 
			String id_permiso){
		PermisosRoles nuevo=new PermisosRoles();
		Rol elRol=this.miRepositorioRol.findById(id_rol).get();
		Permiso
		elPermiso=this.miRepositorioPermiso.findById(id_permiso).get();
		if (elRol!=null && elPermiso!=null){
			nuevo.setPermiso(elPermiso);
			nuevo.setRol(elRol);
			return this.miRepositorioPermisoRoles.save(nuevo);
		}else{
			return null;
		}
	}
	@GetMapping("{id}")
	public PermisosRoles show(@PathVariable String id){
		PermisosRoles permisosRolesActual=this.miRepositorioPermisoRoles
				.findById(id)
				.orElse(null);
		return permisosRolesActual;
	}

	/**
	 * Modificación Rol y Permiso
	 * @param id
	 * @param id_rol
	 * @param id_permiso
	 * @return
	 */

	@PutMapping("{id}/rol/{id_rol}/permiso/{id_permiso}")
	public PermisosRoles update(@PathVariable String id,@PathVariable
			String id_rol,@PathVariable String id_permiso){
		PermisosRoles permisosRolesActual=this.miRepositorioPermisoRoles
				.findById(id)
				.orElse(null);
		Rol elRol=this.miRepositorioRol.findById(id_rol).get();
		Permiso
		elPermiso=this.miRepositorioPermiso.findById(id_permiso).get();
		if(permisosRolesActual!=null && elPermiso!=null && elRol!=null){
			permisosRolesActual.setPermiso(elPermiso);
			permisosRolesActual.setRol(elRol);
			return
					this.miRepositorioPermisoRoles.save(permisosRolesActual);
		}else{
			return null;
		}
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id){
		PermisosRoles permisosRolesActual=this.miRepositorioPermisoRoles
				.findById(id)
				.orElse(null);
		if (permisosRolesActual!=null){
			this.miRepositorioPermisoRoles.delete(permisosRolesActual);
		}
	}
	
	@GetMapping("/validar-permiso/rol/{id_rol}")
	public PermisosRoles getPermiso(@PathVariable String id_rol,
			@RequestBody Permiso infoPermiso){
		Permiso elPermiso=this.miRepositorioPermiso
				.getPermiso(infoPermiso.getUrl(),
						infoPermiso.getMetodo());
	Rol elRol=this.miRepositorioRol.findById(id_rol).get();
	if (elPermiso!=null && elRol!=null){
		PermisosRoles permisoRol = this.miRepositorioPermisoRoles.getPermisoRol(elRol.get_id(),
				elPermiso.get_id());
		return 	permisoRol;
		
	}else{
		return null;
		}
	}
}