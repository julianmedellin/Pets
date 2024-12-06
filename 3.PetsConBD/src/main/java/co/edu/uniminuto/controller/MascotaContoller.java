package co.edu.uniminuto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
    
    @GetMapping(value="mascotas")
    public List<Mascota> getListMascotas(){
    	return serv.ListMascota();
    	
    }
    @GetMapping(value="mascota/{id}")
    public Mascota getByMascotaId(@PathVariable("id")int id) {
    	return serv.searchByIdMascota(id);
    }
   
    }
    

