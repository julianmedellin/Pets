package co.edu.uniminuto.dao;

import java.util.List;

import co.edu.uniminuto.entity.Mascota;

public interface IMascotaDao {

	List<Mascota> ListMascota(); //Lista todas las mascotas
	Mascota searchByIdMascota(int id);// Busqueda por id
	Mascota addMascota(Mascota mascota); //Agregar una nueva mascota
	Mascota upMascota(Mascota mascota); // Actualizar mascota
	boolean delMascota(int id); //Dar de baja en forma logica no se puede borrar facilmente
}

