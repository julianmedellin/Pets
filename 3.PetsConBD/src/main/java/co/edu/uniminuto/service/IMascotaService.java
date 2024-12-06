package co.edu.uniminuto.service;

import java.util.List;

import co.edu.uniminuto.entity.Mascota;

public interface IMascotaService {
	List<Mascota> ListMascota(); //Lista todas las mascotas
	Mascota searchByIdMascota(int id);// Busqueda por id
	List<Mascota> listMascota5();
	List<Mascota> listMascotaMenor5();
	Mascota addMascota(Mascota mascota); //Agregar una nueva mascota
	Mascota upMascota(Mascota mascota); // Actualizar mascota
	boolean delMascota(int id); //Dar de baja en forma logica no se puede borrar facilmente
}
