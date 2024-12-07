package co.edu.uniminuto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniminuto.entity.Mascota;
import co.edu.uniminuto.service.IMascotaService;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin("*")
@RequestMapping(value="api")
public class MascotaContoller {

    @Autowired
	IMascotaService serv;
	
    
    @GetMapping(value="mascotas",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Mascota> getListPets(){
    	return serv.ListMascota();
    	
    }
    @GetMapping(value="mascota/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
    public Mascota getByPetsId(@PathVariable("id")int id) {
    	return serv.searchByIdMascota(id);
    }
   @GetMapping(value="mascotas-mayor5", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Mascota> getListPets5(){
	   return serv.listMascota5();
   }
   @GetMapping(value="mascotas-menor5", produces=MediaType.APPLICATION_JSON_VALUE)
   public List<Mascota> getListPetsMenor(){
	   return serv.listMascota5();
   }
   
   @PostMapping(value="mascotas-menor5", produces=MediaType.APPLICATION_JSON_VALUE,
		   consumes= MediaType.APPLICATION_JSON_VALUE)
   public Mascota postPets(@RequestBody Mascota mascota) {
 
	   return serv.addMascota(mascota);
   }
   @PutMapping(value="mascotas-menor5", produces=MediaType.APPLICATION_JSON_VALUE,
		   consumes= MediaType.APPLICATION_JSON_VALUE)
   public Mascota putPets(@RequestBody Mascota mascota) {
 
	   return serv.addMascota(mascota);
    }
}

